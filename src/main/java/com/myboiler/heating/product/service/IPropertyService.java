package com.myboiler.heating.product.service;

import java.util.List;

import com.myboiler.heating.product.entity.Property;

public interface IPropertyService {
	List<Property> getAllProperty();
	List<Property> getPropertyByOccupantsName(String occupantsName);
	List<Property> getPropertyByCustomerID(long customerId);
	List<Property> getPropertyByCity(String city);
	List<Property> getPropertyByRegion(String region);
	List<Property> getPropertyByPostalCode(String postalCode);
}
