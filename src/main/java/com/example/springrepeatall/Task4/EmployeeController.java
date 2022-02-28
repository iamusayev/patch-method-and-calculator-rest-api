package com.example.springrepeatall.Task4;


import com.example.springrepeatall.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService service;

    @PostMapping("/{id}")
    public void createEmployee(@PathVariable Long id,
                               @RequestBody Employee employee) {
        service.createEmployee(id, employee);
    }

    @PatchMapping("/{id}/name")
    public void updateEmployeeName(@PathVariable Long id,
                                   @RequestParam(value = "value") String name) {
        service.updateEmployeeName(id, name);
    }

    @PatchMapping("/{id}/surname")
    public void updateEmployeeSurname(@PathVariable Long id,
                                      @RequestParam(value = "value") String surname) {
        service.updateEmployeeSurname(id, surname);
    }
}
