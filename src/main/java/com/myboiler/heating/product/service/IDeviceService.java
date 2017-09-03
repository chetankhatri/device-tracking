package com.myboiler.heating.product.service;

import java.util.List;

import com.myboiler.heating.product.entity.Device;

public interface IDeviceService {
	List<Device> getAllDevices();
	List<Device> getDevicesByApplianceType(String applianceType);
	List<Device> getDevicesByManufacturer(String manufacturer);
	Device getDeviceByUPC(String upc);
	List<Device> getDeviceByDateInstalled(String dateInstalled);
	List<Device> getDeviceByPropertyID(long propertyId);
}
