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

    @Override
    public employee findEmployeeById(int eno) {
        return employeemapper.findEmpById(eno);
    }

    @Override
    public int addEmployeeById(employee newEmp) {
        return employeemapper.addEmpById(newEmp);
    }

    @Override
    public int delEmployeeById(Integer eno) {
        int state=200;
        if(employeemapper.delEmpById(eno)==0)
        {
            state=401;
        }

        return state;
    }
}
