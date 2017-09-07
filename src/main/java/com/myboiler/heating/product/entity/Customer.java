package com.myboiler.heating.product.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name = "customer")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@ApiModelProperty(notes = "The database generated Customer ID")
	@Column(name = "customer_id")
	private long customerId;
	@ApiModelProperty(notes = "The title of the customer", required = true)
	@Column(name = "title")
	private String title;
	@ApiModelProperty(notes = "The firstname of the customer", required = true)
	@Column(name = "first_name")
	private String firstName;
	@ApiModelProperty(notes = "The lastname of the customer", required = true)
	@Column(name = "last_name")
	private String lastName;
	@ApiModelProperty(notes = "The company name of the customer", required = true)
	@Column(name = "company_name")
	private String companyName;
	@ApiModelProperty(notes = "The building number of the customer", required = true)
	@Column(name = "building_number")
	private String buildingNumber;
	@ApiModelProperty(notes = "The street address of the customer", required = true)
	@Column(name = "street_address")
	private String streetAddress;
	@ApiModelProperty(notes = "The city of the customer", required = true)
	@Column(name = "city")
	private String city;
	@ApiModelProperty(notes = "The region of the customer", required = true)
	@Column(name = "region")
	private String region;
	@ApiModelProperty(notes = "The postal code of the customer", required = true)
	@Column(name = "postal_code")
	private String postalCode;
	@ApiModelProperty(notes = "The landline number of the customer")
	@Column(name = "landline")
	private String landLine;
	@ApiModelProperty(notes = "The mobile number of the customer", required = true)
	@Column(name = "mobile")
	private String mobile;
	@ApiModelProperty(notes = "The email of the customer", required = true)
	@Column(name = "email")
	private String email;
	@ApiModelProperty(notes = "The Secondary email of the customer", required = true)
	@Column(name = "secondary_email")
	private String secondaryEmail;
	@ApiModelProperty(notes = "The Note for the customer")
	@Column(name = "notes")
	private String notes;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(long customerId, String title, String firstName, String lastName, String companyName,
			String buildingNumber, String streetAddress, String city, String region, String postalCode, String landLine,
			String mobile, String email, String secondaryEmail, String notes) {
		super();
		this.customerId = customerId;
		this.title = title;
		this.firstName = firstName;
		this.lastName = lastName;
		this.companyName = companyName;
		this.buildingNumber = buildingNumber;
		this.streetAddress = streetAddress;
		this.city = city;
		this.region = region;
		this.postalCode = postalCode;
		this.landLine = landLine;
		this.mobile = mobile;
		this.email = email;
		this.secondaryEmail = secondaryEmail;
		this.notes = notes;
	}
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
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
	public String getLandLine() {
		return landLine;
	}
	public void setLandLine(String landLine) {
		this.landLine = landLine;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSecondaryEmail() {
		return secondaryEmail;
	}
	public void setSecondaryEmail(String secondaryEmail) {
		this.secondaryEmail = secondaryEmail;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	
	
}
