package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@Controller
public class EmployeeController {
	EmployeeService employeeService;
	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	@GetMapping("/employee")
	public String employeeMapper(Model model) {
		List<Employee> employees = employeeService.fetchEmployees();
		model.addAttribute("employees",employees);
		return "employee";
	}
	
	@GetMapping("/addEmployee")
	public String addEmployeeMapper(Model model) {
		model.addAttribute("employee",new Employee());
		return "addEmployee";
	}
	
	@PostMapping("/saveEmployee")
	public String saveEmployeeMapper(Employee employee) {
		employeeService.saveEmployees(employee);
		return "redirect:/employee";
	}
	
	@GetMapping("/updateEmployee/{id}")
	public String updateEmployeeMapper(@PathVariable Long id,Model model) {
		Employee employee = employeeService.getEmployeeById(id);
		model.addAttribute("employee",employee);
		return "addEmployee";
	}
	
	@GetMapping("/deleteEmployee/{id}")
	public String deleteEmployeeMapper(@PathVariable Long id) {
		employeeService.deleteEmployeeByid(id);
		return "redirect:/employee";
	}
}
