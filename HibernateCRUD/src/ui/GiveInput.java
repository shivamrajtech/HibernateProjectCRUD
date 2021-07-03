package ui;



import java.util.Scanner;

import bean.Customer;
import service.CustomerService;

public class GiveInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//createAccount();
		 viewDetails();
		//updateAccount();
	}
/*
	public static void createAccount(){
		
		try {
			System.out.println("Account Createing");
			Customer  cr_acc = new Customer();
			cr_acc.setCustomerId(004);
			cr_acc.setCustomerName("Rahul");
			cr_acc.setDateOfBirth(null);
			cr_acc.setAddress("patna");
			cr_acc.setContactNumber("85579%5835");
			
			CustomerService cr = new CustomerService();
			cr.createAccount(cr_acc);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	*/
	
	
	
	public static void viewDetails() {
		

		
		
		  Scanner  scanner =new Scanner(System.in);
		   int cs_id = scanner.nextInt();
			 try {
				
				System.out.println("View The Account Details");
				
				  
				  CustomerService cr = new CustomerService();
				  Customer pb = cr.viewDetails(cs_id);
				  
				  System.out.println("Customer Details");
				  System.out.println("Customer Name " + pb.getCustomerName() 
				  + "Phone Number " + pb.getContactNumber());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
		
	}
	
	/*
	
	
	public static void updateAccount() {
		 
		System.out.println("Which Account Details Do you want to update");
		//Scanner scanner = new Scanner(System.in);
		//int  cs_id = scanner.nextInt();
		
		try {
			Customer cs_id1 =new Customer();
			cs_id1.setCustomerId(101);
			cs_id1.setCustomerName("afafa");
			cs_id1.setDateOfBirth(null);
			cs_id1.setCustomerName(null);
			
			CustomerService cr = new CustomerService();
			cr.updateAccount(cs_id1);
			System.out.println("Your data is updated");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
  */	
	public static void deleteAccount() {
		
	}
}
