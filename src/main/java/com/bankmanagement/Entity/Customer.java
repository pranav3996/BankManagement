package com.bankmanagement.Entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Customer")
@Component
public class Customer {
    
	@Id
	@Column(name="Customer_ID",nullable = false)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int c_id;
	
	@Column(name="First_Name",nullable = false)
	private String firstName;
	
	@Column(name="Middle_Name",nullable = false)
	private String middleName;
	
	@Column(name="Last_Name",nullable = false)
	private String lastName;
	
	@Column(name="Email",nullable = false)
	private String email;
	
	@Column(name="Mobile_Number",nullable = false)
	private long mobileNumber;
	
	@Column(name="Alternate_Number",nullable = false)
	private long alterNumber;
	
	@Column(name="DOB",nullable = false)
	private String date;
	
	@Column(name="Aadhaar_Number",nullable = false)
	private long aadhaar;
	
	@Column(name="PAN_Number",nullable = false)
	private String  pan;
	
	@Column(name="Married_Status",nullable = false)
	private String marriedStatus;
	
	@Column(name="Address_Type",nullable = false)
	private String addressType;
	
	@Column(name="Occupation",nullable = false)
	private String occupation;
	
	@Column(name="Street_Address",nullable = false)
	private String streetAddress;
	
	@Column(name="City",nullable = false)
	private String city;
	
	@Column(name="State",nullable = false)
	private String state;
	
	@Column(name="Zip_Code",nullable = false)
	private int zip;

	
	
	
	public Customer(int c_id, String firstName, String middleName, String lastName, String email, long mobileNumber,
			long alterNumber, String date, long aadhaar, String pan, String marriedStatus, String addressType,
			String occupation, String streetAddress, String city, String state, int zip) {
		super();
		this.c_id = c_id;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.alterNumber = alterNumber;
		this.date = date;
		this.aadhaar = aadhaar;
		this.pan = pan;
		this.marriedStatus = marriedStatus;
		this.addressType = addressType;
		this.occupation = occupation;
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}


	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	
	public long getAlterNumber() {
		return alterNumber;
	}
	public void setAlterNumber(long alterNumber) {
		this.alterNumber = alterNumber;
	}
	

	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	
	public long getAadhaar() {
		return aadhaar;
	}
	public void setAadhaar(long aadhaar) {
		this.aadhaar = aadhaar;
	}
	
	
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	
	
	public String getMarriedStatus() {
		return marriedStatus;
	}
	public void setMarriedStatus(String marriedStatus) {
		this.marriedStatus = marriedStatus;
	}
	

	public String getAddressType() {
		return addressType;
	}
	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}
	
	
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
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
	

	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Customer(String firstName, String middleName, String lastName, String email, long mobileNumber,
			long alterNumber, String date, long aadhaar, String pan, String marriedStatus, String addressType,
			String occupation, String streetAddress, String city, String state, int zip) {
		super();
		
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.alterNumber = alterNumber;
		this.date = date;
		this.aadhaar = aadhaar;
		this.pan = pan;
		this.marriedStatus = marriedStatus;
		this.addressType = addressType;
		this.occupation = occupation;
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	
	
	
	@Override
	public String toString() {
		return "Customer [c_id=" + c_id + ", firstName=" + firstName + ", middleName=" + middleName + ", lastName="
				+ lastName + ", email=" + email + ", mobileNumber=" + mobileNumber + ", alterNumber=" + alterNumber
				+ ", date=" + date + ", aadhaar=" + aadhaar + ", pan=" + pan + ", marriedStatus=" + marriedStatus
				+ ", addressType=" + addressType + ", occupation=" + occupation + ", streetAddress=" + streetAddress
				+ ", city=" + city + ", state=" + state + ", zip=" + zip + "]";
	}
	
	
	
	
}
