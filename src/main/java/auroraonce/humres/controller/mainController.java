package auroraonce.humres.controller;

import auroraonce.humres.service.loginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mainController {

    @Autowired
    loginService loginservice;

    @RequestMapping("/")
    public String test()
    {
        return loginservice.findAllEmployee().toString();
    }

}
