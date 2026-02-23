package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepository;

@Service
public class CustomerService {
	public CustomerRepository customerRepository;
	public CustomerService(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	
	public void saveCustomerDetails(Customer customer) {
		customerRepository.save(customer);
	}
	
	public List<Customer> getCustomerDetails(){
		return customerRepository.findAll();
	}
	
	public void deleteCustomer(Long id){
		customerRepository.deleteById(id);
	}
	
	public Customer getCustomerById(Long id) {
		return customerRepository.findById(id).orElse(null);
	}
}
