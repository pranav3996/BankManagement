package com.bankmanagement.model;




public class CustomerPojo{
	
	private int c_id;
	private String firstName;
	private String middleName;
	private String lastName;
	private String email;
	private long mobileNumber;
	private long alterNumber;
	private String date;
	private long aadhaar;
	private String pan;
	private String marriedStatus;
	private String addressType;
	private String occupation;
	private String streetAddress;
	private String city;
	private String state;
	private int zip;
	
	
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
	public CustomerPojo(int c_id, String firstName, String middleName, String lastName, String email, long mobileNumber,
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
	
	public CustomerPojo() {
		
	}
	@Override
	public String toString() {
		return "CustomerPojo [C_id=" + c_id + ", firstName=" + firstName + ", middleName=" + middleName + ", lastName="
				+ lastName + ", email=" + email + ", mobileNumber=" + mobileNumber + ", alterNumber=" + alterNumber
				+ ", date=" + date + ", aadhaar=" + aadhaar + ", pan=" + pan + ", marriedStatus=" + marriedStatus
				+ ", addressType=" + addressType + ", occupation=" + occupation + ", streetAddress=" + streetAddress
				+ ", city=" + city + ", state=" + state + ", zip=" + zip + "]";
	}
	
}