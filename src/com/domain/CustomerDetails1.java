package com.domain;

public class CustomerDetails1 {
	private int id;
	private String firstName;
	private String lastName;
	private CustomerAddress1 address;
	private long mobileNumber;
	private double balance;
	static int counter =1;
	public CustomerDetails1(String firstName, String lastName, CustomerAddress1 address, long mobileNumber,
			double balance) {
		super();
		this.id = counter++;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.mobileNumber = mobileNumber;
		this.balance = balance;
	}
	public CustomerDetails1(){
		this.id = counter++;

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
	public CustomerAddress1 getAddress() {
		return address;
	}
	public void setAddress(CustomerAddress1 address) {
		this.address = address;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getId() {
		return id;
	}

	public String toString() {
		return "CustomerDetails [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", address="
				+ address + ", mobileNumber=" + mobileNumber + ", balance=" + balance + "]";
	}




}
