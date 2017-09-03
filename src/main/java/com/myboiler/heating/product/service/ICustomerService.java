package com.myboiler.heating.product.service;

import java.util.List;

import com.myboiler.heating.product.entity.Customer;

public interface ICustomerService {
	List<Customer> getAllCustomer();
	Customer getCustomerByName(String firstName, String lastName);
	Customer getCustomerByID(long customerId);
	List<Customer> getCustomerByRegion(String region);
	List<Customer> getCustomerByCity(String city);
	List<Customer> getCustomerByCompany(String companyName);
	boolean saveCustomer(Customer customer);
	boolean deleteCustomer(String firstName, String lastName);
}
