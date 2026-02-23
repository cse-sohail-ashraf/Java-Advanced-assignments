package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Customer;
import com.example.demo.service.CustomerService;

@Controller
public class CustomerController {
	public CustomerService customerService;
	public CustomerController(CustomerService customerService) {
		this.customerService = customerService;
	}
	
	@GetMapping("/customers")
	public String customerMapping(Model model) {
		List<Customer> customersList = customerService.getCustomerDetails();
		model.addAttribute("customers",customersList);
		return "customers";
	}
	
	@GetMapping("/addCustomer")
	public String addCustomerMapping(Model model) {
		model.addAttribute("customer",new Customer());
		return "addCustomer";
	}

	@PostMapping("/saveCustomer")
	public String saveCustomerMapping(Customer customer) {
		customerService.saveCustomerDetails(customer);
		return "redirect:/customers";
	}
	
	@GetMapping("/editCustomer/{id}")
	public String showEditFom(@PathVariable Long id,Model model) {
		Customer customer = customerService.getCustomerById(id);
		model.addAttribute("customer",customer);
		return "addCustomer";
	}
	
	@GetMapping("/deleteCustomer/{id}")
	public String deleteCustomerMapping(@PathVariable Long id) {
		customerService.deleteCustomer(id);
		return "redirect:/customers";
	}
	
	
}
