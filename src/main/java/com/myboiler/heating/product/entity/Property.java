package com.myboiler.heating.product.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name = "property")
public class Property {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@ApiModelProperty(notes = "The database generated Property ID")
	@Column(name = "property_id")
	private long propertyId;
	@ApiModelProperty(notes = "The database generated Customer ID")
	@Column(name = "customer_id")
	private long customerId;
	@ApiModelProperty(notes = "The Building number of property", required=true)
	@Column(name = "building_number")
	private String buildingNumber;
	@ApiModelProperty(notes = "The Street Address of property", required=true)
	@Column(name = "street_address")
	private String streetAddress;
	@ApiModelProperty(notes = "The City of property", required=true)
	@Column(name = "city")
	private String city;
	@ApiModelProperty(notes = "The Region of property", required=true)
	@Column(name = "region")
	private String region;
	@ApiModelProperty(notes = "The postal code of property", required=true)
	@Column(name = "postal_code")
	private String postalCode;
	@ApiModelProperty(notes = "The Building number of property", required=true)
	@Column(name = "country_code")
	private String countryCode;
	@ApiModelProperty(notes = "The Occupants name of property", required=true)
	@Column(name = "occupants_name")
	private String occupantsName;
	@ApiModelProperty(notes = "The Occupants phone of property", required=true)
	@Column(name = "occupants_phone")
	private String occupantsPhone;
	@ApiModelProperty(notes = "The Occupants email of property", required=true)
	@Column(name = "occupants_email")
	private String occupantsEmail;
	@ApiModelProperty(notes = "Notes for property", required=true)
	@Column(name = "notes")
	private String notes;
	
	public Property() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Property(long propertyId, long customerId, String buildingNumber, String streetAddress, String city,
			String region, String postalCode, String countryCode, String occupantsName, String occupantsPhone,
			String occupantsEmail, String notes) {
		super();
		this.propertyId = propertyId;
		this.customerId = customerId;
		this.buildingNumber = buildingNumber;
		this.streetAddress = streetAddress;
		this.city = city;
		this.region = region;
		this.postalCode = postalCode;
		this.countryCode = countryCode;
		this.occupantsName = occupantsName;
		this.occupantsPhone = occupantsPhone;
		this.occupantsEmail = occupantsEmail;
		this.notes = notes;
	}
	public long getPropertyId() {
		return propertyId;
	}
	public void setPropertyId(long propertyId) {
		this.propertyId = propertyId;
	}
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public String getBuildingNumber() {
		return buildingNumber;
	}
	public void setBuildingNumber(String buildingNumber) {
		this.buildingNumber = buildingNumber;
	}
	public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getOccupantsName() {
		return occupantsName;
	}
	public void setOccupantsName(String occupantsName) {
		this.occupantsName = occupantsName;
	}
	public String getOccupantsPhone() {
		return occupantsPhone;
	}
	public void setOccupantsPhone(String occupantsPhone) {
		this.occupantsPhone = occupantsPhone;
	}
	public String getOccupantsEmail() {
		return occupantsEmail;
	}
	public void setOccupantsEmail(String occupantsEmail) {
		this.occupantsEmail = occupantsEmail;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	
	
	
	
}
