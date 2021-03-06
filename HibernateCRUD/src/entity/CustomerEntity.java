package entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  //class level Annotation ,@Enity maps the CustomerEntity class with Customer table
@Table(name="Customer")//it class level Annotation , when we used the class is different from table name
public class CustomerEntity {
	
	  @Id// it is field-level Annotation // PRIMARY KEY
	  private int customerId;
	  private String customerName;
	  private Date  dateOfBirth;
	  private String address;
	  @Column(name="phoneNumber")//it is field-level Annotation , map an attribute of the class with a column in the table
	  //when their name are different.Here attribute contactNumber is mapped to the PhoneNumber column..
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
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
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
