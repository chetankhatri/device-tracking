package com.myboiler.heating.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.myboiler.heating.product.service.IPropertyService;
import com.myboiler.heating.product.entity.Property;
import java.util.List;
@Controller
@RequestMapping("/api/v1/property")
public class PropertyController {
	@Autowired 
	private IPropertyService propertyService;
	@GetMapping("all")
	public ResponseEntity<List<Property>> getAllProperty()
	{
		List<Property> property = propertyService.getAllProperty();
		return new ResponseEntity<List<Property>>(property, HttpStatus.OK);
	}
	@GetMapping("occupantsname")
	public ResponseEntity<List<Property>> getPropertyByOccupantsName(@RequestParam("occupantsName") String occupantsName)
	{
		List<Property> property = propertyService.getPropertyByOccupantsName(occupantsName);
		return new ResponseEntity<List<Property>>(property, HttpStatus.OK);
	}
	@GetMapping("customerid")
	public ResponseEntity<List<Property>> getPropertyByCustomerID(@RequestParam("customerId") long customerId)
	{
		List<Property> property = propertyService.getPropertyByCustomerID(customerId);
		return new ResponseEntity<List<Property>>(property, HttpStatus.OK);
	}
	@GetMapping("citywise")
	public ResponseEntity<List<Property>> getPropertyByCity(@RequestParam("city") String city)
	{
		List<Property> property = propertyService.getPropertyByCity(city);
		return new ResponseEntity<List<Property>>(property, HttpStatus.OK);
	}
	@GetMapping("regionwise")
	public ResponseEntity<List<Property>> getPropertyByRegion(@RequestParam("region") String region)
	{
		List<Property> property = propertyService.getPropertyByRegion(region);
		return new ResponseEntity<List<Property>>(property, HttpStatus.OK);
	}
	@GetMapping("postalcodewise")
	public ResponseEntity<List<Property>> getPropertyByPostalCode(@RequestParam("postalCode") String postalCode)
	{
		List<Property> property = propertyService.getPropertyByPostalCode(postalCode);
		return new ResponseEntity<List<Property>>(property, HttpStatus.OK);
	}
	
}
