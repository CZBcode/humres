package auroraonce.humres.service;

import auroraonce.humres.entity.employee;

import java.util.List;

public interface loginService {

    List<employee> findAllEmployee();
    employee findEmployeeById(int eno);

    int delEmployeeById(Integer id);
}
