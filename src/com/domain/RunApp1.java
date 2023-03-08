package com.domain;

import java.util.ArrayList;
import java.util.Scanner;

public class RunApp1 {

	public static void main(String[] args) {
		BankApp1 bank = new BankApp1();
		Scanner sc = new Scanner(System.in);
		int choice;
		do{
			System.out.println("1.Add Customer");
			System.out.println("2.Display All Customers");
			System.out.println("3.Display customer id");
			System.out.println("4.Display customer by firstName");
			System.out.println("5. Money deposit");
			System.out.println("6.Money Withdraw ");
			System.out.println("7.Transfer Money");
			System.out.println("8.E X I T");
			System.out.println("enter your choice :");
			choice = sc.nextInt();
			int id = 0 ;
			double amount;
			switch(choice){

			case 1:
				System.out.println("Enter FirstName");
				String FirstName = sc.next();
				System.out.println("Enter LastName");
				String LastName = sc.next();
				System.out.println("Enter the doorNo");
				String doorNo = sc.next();
				System.out.println("Enter the Street ");
				String street = sc.next();
				System.out.println("Enter the city");
				String city = sc.next();
				System.out.println("Enter the Mobile Number");
				long mobileNumber = sc.nextLong();
				System.out.println("enter the Balance");
				double Balance = sc.nextDouble();
				CustomerDetails1 customer = new CustomerDetails1(FirstName,LastName,new CustomerAddress1(doorNo,street,city),mobileNumber,Balance);
				bank.addCustomer(customer);
				System.out.println("Customer added successfully... id is :" +customer.getId());
			case 2:
				ArrayList<CustomerDetails1> customers = bank.getCustomers();
				for(CustomerDetails1 i:customers){
					System.out.println(customers);
				}
				break;
			case 3:
				System.out.println("Enter customer id to display");
				id = sc.nextInt();
				customer = bank.find(id);
				System.out.println(customer);
				break;
			case 4:
				System.out.println("enter your first name");
				sc.nextLine();
				String firstName = sc.nextLine();
				System.out.println(bank.find(firstName));
				break;
			case 5:
				System.out.println("Enter your Id to Money Deposit");
				id = sc.nextInt();
				System.out.println("enter the moneyDeposit");
				amount = sc.nextDouble();
				String result = bank.deposit(id, amount);
				System.out.println(result);
				break;
			case 6:
				System.out.println("Enter your Id to Money withdraw");
				id = sc.nextInt();
				System.out.println("enter the Money Withdraw");
				amount = sc.nextDouble();
				String results = bank.withdraw(id, amount);
				System.out.println(results);
				break;
			case 7:
				System.out.println("Enter your : Id ");
				int id1 = sc.nextInt();
				System.out.println("Enter your Transfer Id");
				int id2 = sc.nextInt();
				System.out.println("enter amount");
				amount = sc.nextDouble();
				String res = bank.transferAmounnt(id1, id2, amount);
				System.out.println(res);
				break;
			case 8:
				System.out.println("Thank you Visit again");
				break;

			}

		}
		while(choice != 8);

	}
}