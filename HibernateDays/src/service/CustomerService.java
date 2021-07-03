package service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import bean.Customer;
import dao.CustomerDAO;

public class CustomerService {

	public void createAccount(Customer p) throws Exception{
		validateName(p.getCustomerName());
		validateNumber(p.getContactNumber());
		CustomerDAO dao = new CustomerDAO();
		dao.createAccount(p);
		
	}
	public Customer viewDetails(int pnr) throws Exception {
		
		try {
			CustomerDAO vw_acc = new CustomerDAO();
			Customer pb = vw_acc.viewDetails(pnr);
			
			return pb;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}
	public void updateAccount() {
		
	}
	public void deleteAccount() {
		
	}
	
	
	public void validateName(String name) throws Exception {
		
		try {
			String regex = "[A-Za-z]+\\s?[A-Za-z]+";
			if(!name.matches(regex)) {
				System.out.println("Invalid name");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	}
	
	
	public void validateNumber(String cont_num) {
       Pattern number = Pattern.compile("(0|91)?[7-9][0-9]{9}");
	   Matcher m = number.matcher(cont_num);
       if(!m.find()&& m.group().equals(cont_num)) {
			System.out.print("Invalid number");
		}
	}
}