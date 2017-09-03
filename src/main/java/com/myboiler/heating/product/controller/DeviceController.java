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

@Controller
@RequestMapping("/api/v1/device")
public class DeviceController {
	@Autowired 
	private IDeviceService deviceService;
	@GetMapping("all")
	public ResponseEntity<List<Device>> getAllDevices()
	{
		List<Device> device = deviceService.getAllDevices();
		return new ResponseEntity<List<Device>>(device, HttpStatus.OK);
	}
	@GetMapping("appliance")
	public ResponseEntity<List<Device>> getDevicesByApplianceType(@RequestParam("type") String type)
	{
		List<Device> device = deviceService.getDevicesByApplianceType(type);
		return new ResponseEntity<List<Device>>(device, HttpStatus.OK);
	}
	@GetMapping("manufacturer")
	public ResponseEntity<List<Device>> getDevicesByManufacturer(@RequestParam("make") String make)
	{
		List<Device> device = deviceService.getDevicesByManufacturer(make);
		return new ResponseEntity<List<Device>>(device, HttpStatus.OK);
	}
	@GetMapping("upc")
	public ResponseEntity<Device> getDeviceByUPC(@RequestParam("upc") String upc)
	{
		Device device = deviceService.getDeviceByUPC(upc);
		return new ResponseEntity<Device>(device, HttpStatus.OK);
	}
	@GetMapping("installed")
	public ResponseEntity<List<Device>> getDeviceByDateInstalled(@RequestParam("date") String date)
	{
		List<Device> device = deviceService.getDeviceByDateInstalled(date);
		return new ResponseEntity<List<Device>>(device, HttpStatus.OK);
	}
	@GetMapping("property")
	public ResponseEntity<List<Device>> getDeviceByPropertyID(@RequestParam("id") long id)
	{
		List<Device> device = deviceService.getDeviceByPropertyID(id);
		return new ResponseEntity<List<Device>>(device, HttpStatus.OK);
	}
	
}
