package com.myboiler.heating.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.myboiler.heating.product.service.IPropertyService;
import com.myboiler.heating.product.entity.Property;
import java.util.List;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
@Controller
@RequestMapping("/api/v1/property")
@Api(value="PropertyRegistration", description="Operations pertaining to Property in Heating product register")
public class PropertyController {
	@Autowired 
	private IPropertyService propertyService;
	@ApiOperation(value = "View a list of registered Properties",response = Iterable.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    }
    )
	@GetMapping("all")
	public ResponseEntity<List<Property>> getAllProperty()
	{
		List<Property> property = propertyService.getAllProperty();
		return new ResponseEntity<List<Property>>(property, HttpStatus.OK);
	}
	@ApiOperation(value = "Search a Property with an Occupants Name",response = Iterable.class)
	@GetMapping("occupantsname/{occupantsName}")
	public ResponseEntity<List<Property>> getPropertyByOccupantsName(@PathVariable("occupantsName") String occupantsName)
	{
		List<Property> property = propertyService.getPropertyByOccupantsName(occupantsName);
		return new ResponseEntity<List<Property>>(property, HttpStatus.OK);
	}
	@ApiOperation(value = "Search a Property with a Customer ID",response = Iterable.class)
	@GetMapping("customerid/{customerId}")
	public ResponseEntity<List<Property>> getPropertyByCustomerID(@PathVariable("customerId") long customerId)
	{
		List<Property> property = propertyService.getPropertyByCustomerID(customerId);
		return new ResponseEntity<List<Property>>(property, HttpStatus.OK);
	}
	@ApiOperation(value = "Search a Property with a City Name",response = Iterable.class)
	@GetMapping("citywise/{city}")
	public ResponseEntity<List<Property>> getPropertyByCity(@PathVariable("city") String city)
	{
		List<Property> property = propertyService.getPropertyByCity(city);
		return new ResponseEntity<List<Property>>(property, HttpStatus.OK);
	}
	@ApiOperation(value = "Search a Property by Region",response = Iterable.class)
	@GetMapping("regionwise/{region}")
	public ResponseEntity<List<Property>> getPropertyByRegion(@PathVariable("region") String region)
	{
		List<Property> property = propertyService.getPropertyByRegion(region);
		return new ResponseEntity<List<Property>>(property, HttpStatus.OK);
	}
	@ApiOperation(value = "Search a Property with a postal code",response = Iterable.class)
	@GetMapping("postalcodewise/{postcalCode}")
	public ResponseEntity<List<Property>> getPropertyByPostalCode(@PathVariable("postalCode") String postalCode)
	{
		List<Property> property = propertyService.getPropertyByPostalCode(postalCode);
		return new ResponseEntity<List<Property>>(property, HttpStatus.OK);
	}
	
}
