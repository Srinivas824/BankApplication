package com.domain;

import java.util.ArrayList;

public class BankApp1 {
	ArrayList<CustomerDetails1> customersList = new ArrayList <>(); 

	public int addCustomer(CustomerDetails1 c){
		customersList.add(c);
		return c.getId();

	}
	public ArrayList<CustomerDetails1> getCustomers(){
		return customersList ;

	}
	public CustomerDetails1 find(int id){
		for(CustomerDetails1 i : customersList){
			if(i.getId()== id)
				return i; 
		}
		return null;
		
	}
	public ArrayList<CustomerDetails1> find(String firstName){
		for(CustomerDetails1 i : customersList){
			if(firstName.equals(i.getFirstName()) )
				return customersList; 
		}
		return null;
		
	}

	public String deposit(int id ,double amount){
		for(CustomerDetails1 i : customersList){
			if( id == i.getId()){
				i.setBalance(amount+i.getBalance());
				return "Deposit sucessful : Current Balance is :" +i.getBalance();
			}
		}
		return "Deposit Unsucessful";

	}
	public String withdraw(int id ,double amount){
		for(CustomerDetails1 i : customersList){
			if( id == i.getId()){
				i.setBalance(i.getBalance()-amount);
				if(i.getBalance()<0)
					return "Insufficents funds";
				else
					return "Deposit sucessful : Current Balance is :" +i.getBalance();
			}
		}
		return "Deposit Unsucessful";


	}
	public String transferAmounnt(int id1,int id2,double amount){
		for(CustomerDetails1 i : customersList){
			if( id1 == i.getId()){
				for(CustomerDetails1 j : customersList){
					if(i.getBalance()<amount)
						return "Insufficent funds";

					else if( id2 == j.getId()){
						i.setBalance(i.getBalance()-amount);
						j.setBalance(j.getBalance()+amount);
						return "Transfer sucessful : Current Balance is :" +i.getBalance();
					}
				}
			}
		}
		return "transfer unsucessful";
	}
}