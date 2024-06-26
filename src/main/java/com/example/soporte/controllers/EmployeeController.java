package com.example.soporte.controllers;

import com.example.soporte.services.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/employees")
public class EmployeeController extends Controller{
    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        super();
        this.employeeService = employeeService;
    }

    /**
     * Retrieves all employees.
     *
     * @return a ResponseEntity containing a list of employees
     */
    @GetMapping
    public ResponseEntity<?> getEmployees(){
        try {
            return okResponse(employeeService.getEmployees());
        } catch (Exception e) {
            return handleError(e);
        }
    }
}