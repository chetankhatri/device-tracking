package com.myboiler.heating.product.dao;
import com.myboiler.heating.product.entity.Device;
import java.util.List;
public interface IDeviceDAO {
	List<Device> getAllDevices();
	List<Device> getDevicesByApplianceType(String applianceType);
	List<Device> getDevicesByManufacturer(String manufacturer);
	Device getDeviceByUPC(String upc);
	List<Device> getDeviceByDateInstalled(String dateInstalled);
	List<Device> getDeviceByPropertyID(long propertyId);
}
