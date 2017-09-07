package com.myboiler.heating.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.myboiler.heating.product.dao.ICustomerDAO;
import com.myboiler.heating.product.entity.Customer;

@Service
@Transactional
public class CustomerServiceImpl implements ICustomerService {
	@Autowired
	private ICustomerDAO customerDAO;
	@Override
	public List<Customer> getAllCustomer()
	{
		return customerDAO.getAllCustomer();
	}
	@Override
	public Customer getCustomerByName(String firstName, String lastName)
	{
		return customerDAO.getCustomerByName(firstName, lastName);		
	}
	@Override
	public Customer getCustomerByID(long customerId)
	{
		return customerDAO.getCustomerByID(customerId);
	}
	@Override
	public List<Customer> getCustomerByRegion(String region)
	{
		return customerDAO.getCustomerByRegion(region);
	}
	@Override
	public List<Customer> getCustomerByCity(String city)
	{
		return customerDAO.getCustomerByCity(city);
	}
	@Override
	public List<Customer> getCustomerByCompany(String companyName)
	{
		return customerDAO.getCustomerByCompany(companyName);
	}
	@Override
	public synchronized boolean saveCustomer(Customer customer)
	{
		// do validation whether customer already exist.
		boolean isExist = customerDAO.isRegistered(customer.getFirstName(), customer.getLastName());
		if(isExist)
		{
			return true;
		}
		else
		{
			customerDAO.saveCustomer(customer);
			return false;
		}
		
	}
	@Override
	public boolean deleteCustomer(String firstName, String lastName)
	{
		boolean isExist = customerDAO.isRegistered(firstName, lastName);
		if(isExist)
		{
		customerDAO.deleteCustomer(firstName, lastName);
		return true;
		}
		else
		{
		return false;
		}
	}
	
	
}
