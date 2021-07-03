package bean;

import java.util.Date;

public class Customer {
	
	  private int customerId;
	  private String customerName;
	  private Date  dateOfBirth;
	  private String address;
	  private String contactNumber;
  
    public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String coustomerName) {
		this.customerName = coustomerName;
	}
	public Date getDateOfBirth() {
		return this.dateOfBirth;
	}
	public void setDateOfBirth(Date date) {
		this.dateOfBirth = date;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

}
