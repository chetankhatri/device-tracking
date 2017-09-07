package com.myboiler.heating.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.myboiler.heating.product.dao.IPropertyDAO;
import com.myboiler.heating.product.entity.Property;

@Service
@Transactional
public class PropertyServiceImpl implements IPropertyService {
	@Autowired 
	private IPropertyDAO propertyDAO;
	
	@Override
	public List<Property> getAllProperty()
	{
		return propertyDAO.getAllProperty();
	}
	@Override
	public List<Property> getPropertyByOccupantsName(String occupantsName)
	{
		return propertyDAO.getPropertyByOccupantsName(occupantsName);
	}
	@Override
	public List<Property> getPropertyByCustomerID(long customerId)
	{
		return propertyDAO.getPropertyByCustomerID(customerId);
	}
	@Override
	public List<Property> getPropertyByCity(String city)
	{
		return propertyDAO.getPropertyByCity(city);
	}
	@Override
	public List<Property> getPropertyByRegion(String region)
	{
		return propertyDAO.getPropertyByRegion(region);
	}
	@Override
	public List<Property> getPropertyByPostalCode(String postalCode)
	{
		return propertyDAO.getPropertyByPostalCode(postalCode);
	}
}
