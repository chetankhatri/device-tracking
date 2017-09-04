package com.myboiler.heating.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.myboiler.heating.product.service.IDeviceService;
import com.myboiler.heating.product.entity.Device;
import java.util.List;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
@Controller
@RequestMapping("/api/v1/device")
@Api(value="DeviceRegistration", description="Operations pertaining to Device in Heating product register")
public class DeviceController {
	@Autowired 
	private IDeviceService deviceService;
	@ApiOperation(value = "View a list of registered Devices",response = Iterable.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    }
    )
	@GetMapping("all")
	public ResponseEntity<List<Device>> getAllDevices()
	{
		List<Device> device = deviceService.getAllDevices();
		return new ResponseEntity<List<Device>>(device, HttpStatus.OK);
	}
	@ApiOperation(value = "Search a Device with an appliance",response = Iterable.class)
	@GetMapping("appliance")
	public ResponseEntity<List<Device>> getDevicesByApplianceType(@RequestParam("type") String type)
	{
		List<Device> device = deviceService.getDevicesByApplianceType(type);
		return new ResponseEntity<List<Device>>(device, HttpStatus.OK);
	}
	@ApiOperation(value = "Search a Device with a manufacturer",response = Iterable.class)
	@GetMapping("manufacturer")
	public ResponseEntity<List<Device>> getDevicesByManufacturer(@RequestParam("make") String make)
	{
		List<Device> device = deviceService.getDevicesByManufacturer(make);
		return new ResponseEntity<List<Device>>(device, HttpStatus.OK);
	}
	@ApiOperation(value = "Search a Device with a UPC",response = Device.class)
	@GetMapping("upc")
	public ResponseEntity<Device> getDeviceByUPC(@RequestParam("upc") String upc)
	{
		Device device = deviceService.getDeviceByUPC(upc);
		return new ResponseEntity<Device>(device, HttpStatus.OK);
	}
	@ApiOperation(value = "Search a Device with an Installation Date",response = Iterable.class)
	@GetMapping("installed")
	public ResponseEntity<List<Device>> getDeviceByDateInstalled(@RequestParam("date") String date)
	{
		List<Device> device = deviceService.getDeviceByDateInstalled(date);
		return new ResponseEntity<List<Device>>(device, HttpStatus.OK);
	}
	@ApiOperation(value = "Search a Device with a PropertyID",response = Iterable.class)
	@GetMapping("property")
	public ResponseEntity<List<Device>> getDeviceByPropertyID(@RequestParam("id") long id)
	{
		List<Device> device = deviceService.getDeviceByPropertyID(id);
		return new ResponseEntity<List<Device>>(device, HttpStatus.OK);
	}
	
}
