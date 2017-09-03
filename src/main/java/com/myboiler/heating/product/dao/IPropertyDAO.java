package com.myboiler.heating.product.dao;
import com.myboiler.heating.product.entity.Property;
import java.util.List;
public interface IPropertyDAO {
	List<Property> getAllProperty();
	List<Property> getPropertyByOccupantsName(String occupantsName);
	List<Property> getPropertyByCustomerID(long customerId);
	List<Property> getPropertyByCity(String city);
	List<Property> getPropertyByRegion(String region);
	List<Property> getPropertyByPostalCode(String postalCode);
	
}
