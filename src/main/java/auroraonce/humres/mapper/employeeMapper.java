package auroraonce.humres.mapper;

import auroraonce.humres.entity.employee;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface employeeMapper {

    List<employee> findAllEmp();
    employee findEmpById(int eno);
    int delEmpById(int eno);

}
