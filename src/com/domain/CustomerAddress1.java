package com.domain;

public class CustomerAddress1 {
	private String doorNo;
	private String Street;
	private String City;
	public CustomerAddress1(String doorNo, String street, String city) {
		super();
		this.doorNo = doorNo;
		Street = street;
		City = city;
	}
	public CustomerAddress1(){
		
	}
	public String getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	
	public String toString() {
		return "CustomerAddress [doorNo=" + doorNo + ", Street=" + Street + ", City=" + City + "]";
	}
	

}
