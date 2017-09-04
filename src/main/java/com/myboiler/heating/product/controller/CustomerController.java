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

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Controller
@RequestMapping("/api/v1/customer")
@Api(value="customerregistration", description="Operations pertaining to customers in Heating product register")
public class CustomerController {
	@Autowired
	private ICustomerService customerService;
	
	@ApiOperation(value = "View a list of registered customers",response = Iterable.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    }
    )
	@GetMapping("all")
	public ResponseEntity<List<Customer>> getAllCustomer()
	{
		List<Customer> customer = customerService.getAllCustomer();
		return new ResponseEntity<List<Customer>>(customer, HttpStatus.OK);				
	}
	@ApiOperation(value = "Search a customer with an Name",response = Customer.class)
	@GetMapping("name")
	public ResponseEntity<Customer> getCustomerByName(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName)
	{
		Customer customer = customerService.getCustomerByName(firstName, lastName);
		return new ResponseEntity<Customer>(customer, HttpStatus.OK);
	}
	@ApiOperation(value = "Search a customer with an ID",response = Customer.class)
	@GetMapping("id")
	public ResponseEntity<Customer> getCustomerByID(@RequestParam("customerId") long customerId)
	{
		Customer customer = customerService.getCustomerByID(customerId);
		return new ResponseEntity<Customer>(customer, HttpStatus.OK);
	}
	@ApiOperation(value = "Search a customer by Region",response = Iterable.class)
	@GetMapping("regionwise")
	public ResponseEntity<List<Customer>> getCustomerByRegion(@RequestParam("region") String region)
	{
		List<Customer> customer = customerService.getCustomerByRegion(region);
		return new ResponseEntity<List<Customer>>(customer, HttpStatus.OK);
	}
	@ApiOperation(value = "Search a customer by City",response = Iterable.class)
	@GetMapping("citywise")
	public ResponseEntity<List<Customer>> getCustomerByCity(@RequestParam("city") String city)
	{
		List<Customer> customer = customerService.getCustomerByCity(city);
		return new ResponseEntity<List<Customer>>(customer, HttpStatus.OK);
	}
	@ApiOperation(value = "Search a customer by Company name",response = Iterable.class)
	@GetMapping("company")
	public ResponseEntity<List<Customer>> getCustomerByCompany(@RequestParam("companyName") String companyName)
	{
		List<Customer> customer = customerService.getCustomerByCompany(companyName);
		return new ResponseEntity<List<Customer>>(customer, HttpStatus.OK);
	}
	@ApiOperation(value = "Register a customer")
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
	@ApiOperation(value = "Delete customer")
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
