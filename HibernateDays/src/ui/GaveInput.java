package ui;



import java.util.Scanner;

import bean.Customer;
import service.CustomerService;

public class GaveInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//createAccount();
		viewDetails();

	}

	public static void createAccount(){
		
		try {
			System.out.println("Account Create");
			Customer  cr_acc = new Customer();
			cr_acc.setCustomerId(003);
			cr_acc.setCustomerName("Rahul");
			cr_acc.setDateOfBirth(null);
			cr_acc.setAddress("patna");
			cr_acc.setContactNumber("8557988@35");
			
			CustomerService cr = new CustomerService();
			cr.createAccount(cr_acc);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void viewDetails() {
		
		
		
		try {
			System.out.println("View The Account Details");
			 Scanner scanner =new Scanner(System.in);
			  int pnr = scanner.nextInt();
			  
			  CustomerService cr = new CustomerService();
			  Customer pb = cr.viewDetails(pnr);
			  
			  System.out.println("Customer Details");
			  System.out.println("Customer Name " + pb.getCustomerName() 
			  + "Phone Number " + pb.getContactNumber());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	  
		  
		 
	
		
		
	}
	public static void updateAccount() {
		
	}
	public static void deleteAccount() {
		
	}
}