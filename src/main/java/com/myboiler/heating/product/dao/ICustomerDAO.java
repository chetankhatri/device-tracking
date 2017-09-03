package com.myboiler.heating.product.dao;
import java.util.List;
import com.myboiler.heating.product.entity.Customer;

public interface ICustomerDAO {
		List<Customer> getAllCustomer();
		Customer getCustomerByName(String firstName, String lastName);
		Customer getCustomerByID(long customerId);
		List<Customer> getCustomerByRegion(String region);
		List<Customer> getCustomerByCity(String city);
		List<Customer> getCustomerByCompany(String companyName);
		void saveCustomer(Customer customer);
		void deleteCustomer(String firstName, String lastName);
		boolean isRegistered(String firstName, String lastName);
}
