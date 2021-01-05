package auroraonce.humres.service.impl;

import auroraonce.humres.entity.employee;
import auroraonce.humres.mapper.employeeMapper;
import auroraonce.humres.service.loginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class loginServiceImpl implements loginService {

    @Autowired
    employeeMapper employeemapper;

    @Override
    public List<employee> findAllEmployee() {
        return employeemapper.findAllEmp();
    }
}
