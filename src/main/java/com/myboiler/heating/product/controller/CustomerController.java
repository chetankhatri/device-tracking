package com.myboiler.heating.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

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
	@GetMapping("name/{firstName}/{lastName}")
	public ResponseEntity<Customer> getCustomerByName(@PathVariable("firstName") String firstName, @PathVariable("lastName") String lastName)
	{
		Customer customer = customerService.getCustomerByName(firstName, lastName);
		return new ResponseEntity<Customer>(customer, HttpStatus.OK);
	}
	@ApiOperation(value = "Search a customer with an ID",response = Customer.class)
	@GetMapping("getbyid/{id}")
	public ResponseEntity<Customer> getCustomerByID(@PathVariable("id") long customerId)
	{
		Customer customer = customerService.getCustomerByID(customerId);
		return new ResponseEntity<Customer>(customer, HttpStatus.OK);
	}
	@ApiOperation(value = "Search a customer by Region",response = Iterable.class)
	@GetMapping("regionwise/{region}")
	public ResponseEntity<List<Customer>> getCustomerByRegion(@PathVariable("region") String region)
	{
		List<Customer> customer = customerService.getCustomerByRegion(region);
		return new ResponseEntity<List<Customer>>(customer, HttpStatus.OK);
	}
	@ApiOperation(value = "Search a customer by City",response = Iterable.class)
	@GetMapping("citywise/{city}")
	public ResponseEntity<List<Customer>> getCustomerByCity(@PathVariable("city") String city)
	{
		List<Customer> customer = customerService.getCustomerByCity(city);
		return new ResponseEntity<List<Customer>>(customer, HttpStatus.OK);
	}
	@ApiOperation(value = "Search a customer by Company name",response = Iterable.class)
	@GetMapping("company/{companyName}")
	public ResponseEntity<List<Customer>> getCustomerByCompany(@PathVariable("companyName") String companyName)
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
	@DeleteMapping("churn/{firstName}/{lastName}")
	public ResponseEntity<Void> deleteCustomer(@PathVariable("firstName") String firstName, @PathVariable("lastName") String lastName)
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
