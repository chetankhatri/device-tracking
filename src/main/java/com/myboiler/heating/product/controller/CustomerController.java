package com.myboiler.heating.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.myboiler.heating.product.entity.Customer;
import com.myboiler.heating.product.service.ICustomerService;

@Controller
@RequestMapping("/api/v1/customer")
public class CustomerController {
	@Autowired
	private ICustomerService customerService;
	@GetMapping("all")
	public ResponseEntity<List<Customer>> getAllCustomer()
	{
		List<Customer> customer = customerService.getAllCustomer();
		return new ResponseEntity<List<Customer>>(customer, HttpStatus.OK);				
	}
	@GetMapping("name")
	public ResponseEntity<Customer> getCustomerByName(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName)
	{
		Customer customer = customerService.getCustomerByName(firstName, lastName);
		return new ResponseEntity<Customer>(customer, HttpStatus.OK);
	}
	@GetMapping("id")
	public ResponseEntity<Customer> getCustomerByID(@RequestParam("customerId") long customerId)
	{
		Customer customer = customerService.getCustomerByID(customerId);
		return new ResponseEntity<Customer>(customer, HttpStatus.OK);
	}
	@GetMapping("regionwise")
	public ResponseEntity<List<Customer>> getCustomerByRegion(@RequestParam("region") String region)
	{
		List<Customer> customer = customerService.getCustomerByRegion(region);
		return new ResponseEntity<List<Customer>>(customer, HttpStatus.OK);
	}
	@GetMapping("citywise")
	public ResponseEntity<List<Customer>> getCustomerByCity(@RequestParam("city") String city)
	{
		List<Customer> customer = customerService.getCustomerByCity(city);
		return new ResponseEntity<List<Customer>>(customer, HttpStatus.OK);
	}
	@GetMapping("company")
	public ResponseEntity<List<Customer>> getCustomerByCompany(@RequestParam("companyName") String companyName)
	{
		List<Customer> customer = customerService.getCustomerByCompany(companyName);
		return new ResponseEntity<List<Customer>>(customer, HttpStatus.OK);
	}
	@PostMapping("register")
	public ResponseEntity<Void> saveCustomer(@RequestBody Customer customer)
	{
		boolean status = customerService.saveCustomer(customer);
		if(status)
		{	
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
		else
		{
			return new ResponseEntity<Void>(HttpStatus.CREATED);
		}
	}
	@DeleteMapping("churn")
	public ResponseEntity<Void> deleteCustomer(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName)
	{
		boolean status = customerService.deleteCustomer(firstName, lastName); 
		if(status)
		{
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		}
		else
		{
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
		
	}
}
