package com.myboiler.heating.product.dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import com.myboiler.heating.product.entity.Device;

@Repository
public class DeviceDAOImpl implements IDeviceDAO{
	@PersistenceContext
	private EntityManager entityManager;
	@SuppressWarnings("unchecked")
	@Override
	public List<Device> getAllDevices()
	{
		String query = "From Device";
		return (List<Device>) entityManager.createQuery(query).getResultList(); 
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Device> getDevicesByApplianceType(String applianceType)
	{
		String query = "From Device where applianceType=?";
		return (List<Device>) entityManager.createQuery(query).setParameter(1, applianceType).getResultList();
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Device> getDevicesByManufacturer(String manufacturer)
	{
		String query = "From Device where manufacturer=?";
		return (List<Device>) entityManager.createQuery(query).setParameter(1, manufacturer).getResultList();
	}
	@Override
	public Device getDeviceByUPC(String upc)
	{
		return entityManager.find(Device.class, upc);
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Device> getDeviceByDateInstalled(String dateInstalled)
	{
		String query = "From Device where dateInstalled=?";
		return (List<Device>) entityManager.createQuery(query).setParameter(1, dateInstalled).getResultList();
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Device> getDeviceByPropertyID(long propertyId)
	{
		String query = "From Device where propertyId=?";
		return (List<Device>) entityManager.createQuery(query).setParameter(1, propertyId).getResultList();
	}
}
