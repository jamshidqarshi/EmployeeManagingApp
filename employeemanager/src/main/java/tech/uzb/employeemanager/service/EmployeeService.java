package tech.uzb.employeemanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.uzb.employeemanager.exception.UserNotFoundException;
import tech.uzb.employeemanager.model.Employee;
import tech.uzb.employeemanager.repo.EmployeeRepo;

import java.util.List;
import java.util.UUID;

@Service
public class EmployeeService { //we need to inject repository into this class (contructor qo'shiladi)
    private final EmployeeRepo employeeRepo;

@Autowired//to bring dependencies
    public EmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }
    public Employee addEmployee(Employee employee){
    employee.setEmployeeCode(UUID.randomUUID().toString());
    return employeeRepo.save(employee);
    }
    public List<Employee> findAllEmployees() {
    return employeeRepo.findAll();
    }
    public Employee updateEmployee(Employee employee) {         //update the employees
    return employeeRepo.save(employee);
    }

    public Employee findEmployeeById (Long id){
        return employeeRepo.findEmployeeById(id).orElseThrow(() -> new UserNotFoundException("User by id" + id + "was not found"));
    }
    public void deleteEmployee (Long id){
    employeeRepo.deleteEmployeeById(id);
    }
}
