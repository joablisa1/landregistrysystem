package com.landregistrysystem.app.repository;

import com.landregistrysystem.app.model.Employee;

import java.util.ArrayList;
import java.util.List;

public interface EmployeRepository {

    Employee save(Employee employ);
    List<Employee> getAllEmployeeByOccupations(String occupation);
    List<Employee>getAllEmployees();
    Employee getEmployeById(int id);
    Employee getEmployeById();
    Employee updateEmployee(Employee employee);
    List<Employee>getAllEmployees(int pageid, int total);
    void delete(int id);
}
