package com.myboiler.heating.product.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import io.swagger.annotations.ApiModelProperty;
@Entity
@Table(name = "device")
public class Device {
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@ApiModelProperty(notes = "The database generated Device ID")
	@Column(name = "device_id")
	private long deviceId;
	@ApiModelProperty(notes = "The property id of the device", required = true)
	@Column(name = "property_id")
	private long propertyId;
	@ApiModelProperty(notes = "The appliance type of the device", required = true)
	@Column(name = "appliance_type")
	private String applianceType;
	@ApiModelProperty(notes = "The manufacturer of the device", required = true)
	@Column(name = "manufacturer")
	private String manufacturer;
	@ApiModelProperty(notes = "The model of the device", required = true)
	@Column(name = "model")
	private String model;
	@ApiModelProperty(notes = "The UPC of the device", required = true)
	@Column(name = "upc")
	private String upc;
	@ApiModelProperty(notes = "The location of the device", required = true)
	@Column(name = "location")
	private String location;
	@ApiModelProperty(notes = "The date installed of the device", required = true)
	@Column(name = "date_installed")
	private String dateInstalled;
	@ApiModelProperty(notes = "The serial number of the device", required = true)
	@Column(name = "serial_number")
	private String serialNumber;
	@ApiModelProperty(notes = "Notes for the device")
	@Column(name = "notes")
	private String notes;
	
	public Device() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Device(long deviceId, long propertyId, String applianceType, String manufacturer, String model, String upc,
			String location, String dateInstalled, String serialNumber, String notes) {
		super();
		this.deviceId = deviceId;
		this.propertyId = propertyId;
		this.applianceType = applianceType;
		this.manufacturer = manufacturer;
		this.model = model;
		this.upc = upc;
		this.location = location;
		this.dateInstalled = dateInstalled;
		this.serialNumber = serialNumber;
		this.notes = notes;
	}
	public long getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(long deviceId) {
		this.deviceId = deviceId;
	}
	public long getPropertyId() {
		return propertyId;
	}
	public void setPropertyId(long propertyId) {
		this.propertyId = propertyId;
	}
	public String getApplianceType() {
		return applianceType;
	}
	public void setApplianceType(String applianceType) {
		this.applianceType = applianceType;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getUpc() {
		return upc;
	}
	public void setUpc(String upc) {
		this.upc = upc;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDateInstalled() {
		return dateInstalled;
	}
	public void setDateInstalled(String dateInstalled) {
		this.dateInstalled = dateInstalled;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	
	
	
}
