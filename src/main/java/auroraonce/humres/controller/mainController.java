package auroraonce.humres.controller;

import auroraonce.humres.entity.employee;
import auroraonce.humres.service.loginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class mainController {

    @Autowired
    loginService loginservice;

    @RequestMapping(value = "/emp/all",method = RequestMethod.GET)
    public List<employee> showAllEmp()
    {
        return loginservice.findAllEmployee();
    }

    @RequestMapping(value = "/emp/{id}",method = RequestMethod.GET)
    public employee  showEmpById(@PathVariable Integer id)
    {
        return loginservice.findEmployeeById(id);
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
