package com.myboiler.heating.product.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import com.myboiler.heating.product.entity.Customer;


@Repository
public class CustomerDAOImpl implements ICustomerDAO{
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Customer> getAllCustomer()
	{
		String query = "From Customer";
		return (List<Customer>) entityManager.createQuery(query).getResultList();
	}
	@Override
	public Customer getCustomerByName(String firstName, String lastName)
	{
		String query = "From Customer where firstName=? and lastName=?";
		return (Customer) entityManager.createQuery(query).setParameter(1, firstName).setParameter(2, lastName).getSingleResult();
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Customer> getCustomerByRegion(String region)
	{
		String query = "From Customer where region=?";
		return(List<Customer>) entityManager.createQuery(query).setParameter(1, region).getResultList();
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Customer> getCustomerByCity(String city)
	{
		String query = "From Customer where city=?";
		return(List<Customer>) entityManager.createQuery(query).setParameter(1, city).getResultList();
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Customer> getCustomerByCompany(String companyName)
	{
		String query = "From Customer where companyName=?";
		return(List<Customer>) entityManager.createQuery(query).setParameter(1, companyName).getResultList();
	}
	@Override
	public void saveCustomer(Customer customer)
	{	
		entityManager.persist(customer);
	}
	@Override
	public Customer getCustomerByID(long customerId)
	{
		return entityManager.find(Customer.class, customerId);
	}
	@Override
	public void deleteCustomer(String firstName, String lastName)
	{
		entityManager.remove(getCustomerByName(firstName, lastName));
	}
	@Override
	public boolean isRegistered(String firstName, String lastName)
	{
		String query = "From Customer where firstName=? and lastName=?";
		int countOfCustomers = entityManager.createQuery(query).setParameter(1, firstName).setParameter(2, lastName).getResultList().size();
		return countOfCustomers > 0 ? true : false;
	}
}
