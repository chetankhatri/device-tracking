package com.myboiler.heating.product.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import com.myboiler.heating.product.entity.Property;

@Repository
public class PropertyDAOImpl implements IPropertyDAO {
	@PersistenceContext
	private EntityManager entityManager;
	@SuppressWarnings("unchecked")
	@Override
	public List<Property> getAllProperty()
	{
		String query = "From Property";
		return (List<Property>) entityManager.createQuery(query).getResultList();
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Property> getPropertyByOccupantsName(String occupantsName)
	{
		String query = "From Property where occupantsName=?";
		return (List<Property>) entityManager.createQuery(query).setParameter(1, occupantsName).getResultList();
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Property> getPropertyByCustomerID(long customerId)
	{
		String query = "From Property where customerId=?";
		return (List<Property>) entityManager.createQuery(query).setParameter(1, customerId).getResultList();
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Property> getPropertyByCity(String city)
	{
		String query = "From Property where city=?";
		return (List<Property>) entityManager.createQuery(query).setParameter(1, city).getResultList();
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Property> getPropertyByRegion(String region)
	{
		String query = "From Property where region=?";
		return (List<Property>) entityManager.createQuery(query).setParameter(1, region).getResultList();
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Property> getPropertyByPostalCode(String postalCode)
	{
		String query = "From Property where postalCode=?";
		return (List<Property>) entityManager.createQuery(query).setParameter(1, postalCode).getResultList();
	}
}
