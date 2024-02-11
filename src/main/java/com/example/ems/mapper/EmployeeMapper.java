package com.example.ems.mapper;

import com.example.ems.dto.EmployeeDto;
import com.example.ems.entity.Employee;

public class EmployeeMapper {
//    we use this mapper class to convert EmployeeDto to Employee JPA entity and vice versa
    public static EmployeeDto mapToEmployeeDto(Employee employee){
        //this will convert employee JPA entity to EmployeeDto
        return new EmployeeDto(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail()
        );
    }

    public static Employee mapToEmployee(EmployeeDto employeeDto){
        return new Employee(
                employeeDto.getId(),
                employeeDto.getFirstName(),
                employeeDto.getLastName(),
                employeeDto.getEmail()
        );
    }
}
