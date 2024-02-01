package io.rhuancampos.projectbackend.controller;

import io.rhuancampos.projectbackend.dto.EmployeeDto;
import io.rhuancampos.projectbackend.dto.mapper.EmployeeMapper;
import io.rhuancampos.projectbackend.entity.Employee;
import io.rhuancampos.projectbackend.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @PostMapping
    public ResponseEntity<EmployeeDto> create(@RequestBody EmployeeDto employeeDto){
        Employee employee = employeeService.createEmployee(EmployeeMapper.toEmployee(employeeDto));
        return ResponseEntity.status(HttpStatus.CREATED).body(EmployeeMapper.toEmployeeDto(employee));
    }
}
