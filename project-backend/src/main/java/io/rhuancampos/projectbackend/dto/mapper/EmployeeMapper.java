package io.rhuancampos.projectbackend.dto.mapper;

import io.rhuancampos.projectbackend.dto.EmployeeDto;
import io.rhuancampos.projectbackend.entity.Employee;
import org.modelmapper.ModelMapper;

public class EmployeeMapper {

    public static EmployeeDto toEmployeeDto(Employee employee) {
        return new ModelMapper().map(employee, EmployeeDto.class);
    }

    public static Employee toEmployee(EmployeeDto employeeDto) {
        return new ModelMapper().map(employeeDto, Employee.class);
    }
}

