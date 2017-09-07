package com.myboiler.heating.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.myboiler.heating.product.dao.IDeviceDAO;
import com.myboiler.heating.product.entity.Device;

@Service
@Transactional
public class DeviceServiceImpl implements IDeviceService{
	
	@Autowired 
	private IDeviceDAO deviceDAO;
	@Override
	public List<Device> getAllDevices()
	{
		return deviceDAO.getAllDevices();
	}
	@Override
	public List<Device> getDevicesByApplianceType(String applianceType)
	{
		return deviceDAO.getDevicesByApplianceType(applianceType);
	}
	@Override
	public List<Device> getDevicesByManufacturer(String manufacturer)
	{
		return deviceDAO.getDevicesByManufacturer(manufacturer);
	}
	@Override
	public Device getDeviceByUPC(String upc)
	{
		return deviceDAO.getDeviceByUPC(upc);
	}
	@Override
	public List<Device> getDeviceByDateInstalled(String dateInstalled)
	{
		return deviceDAO.getDeviceByDateInstalled(dateInstalled);
	}
	@Override
	public List<Device> getDeviceByPropertyID(long propertyId)
	{
		return deviceDAO.getDeviceByPropertyID(propertyId);
	}
}
