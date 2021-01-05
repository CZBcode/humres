package auroraonce.humres.controller;

import auroraonce.humres.entity.employee;
import auroraonce.humres.service.loginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Method;

@RestController
public class mainController {

    @Autowired
    loginService loginservice;

    @RequestMapping(value = "/emp/all",method = RequestMethod.GET)
    public String showAllEmp()
    {
        return loginservice.findAllEmployee().toString();
    }

    @RequestMapping(value = "/emp/{id}",method = RequestMethod.GET)
    public String showEmpById(@PathVariable Integer id)
    {
        return loginservice.findEmployeeById(id).getName();
    }

    @RequestMapping(value = "/emp/{id}",method = RequestMethod.DELETE)
    public int delEmpById(@PathVariable Integer id)
    {
        return loginservice.delEmployeeById(id);
    }

    @RequestMapping(value = "/emp/add",method = RequestMethod.POST)
    public int addEmpById(@PathVariable employee emp)
    {
        return loginservice.addEmployeeById(emp);
    }

}
