package dao;

import org.hibernate.SessionFactory;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import bean.Customer;
import entity.CustomerEntity;
import resource.HibernateUtility;


public class CustomerDAO{
	
	/*
	public int createAccount(Customer cst_acc){
	
	SessionFactory factory =	HibernateUtility.createSessionFactory();
	
	Session	session = null;
	
	try {
		session = factory.openSession();
		
		CustomerEntity  entity = new CustomerEntity();
		entity.setCustomerId(cst_acc.getCustomerId());
		entity.setCustomerName(cst_acc.getCustomerName());
		entity.setAddress(cst_acc.getAddress());
		entity.setContactNumber(cst_acc.getContactNumber());
		
		
		session.beginTransaction();
		int cst_id =(int) session.save(entity);  //casting
		session.getTransaction().commit();
		
		return cst_id;
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		throw e;
	}finally {
		
		if(session!=null) session.close();
		if(factory!=null) factory.close();
	}
	
		
		
	}
	*/
	
	
	
	
	public Customer viewDetails(int cs_id) throws Exception {
		
		SessionFactory  factory = HibernateUtility.createSessionFactory();
		Session session = null;
		Customer pb = null;
		
		 try {
			session = factory.openSession();
			 CustomerEntity entity = (CustomerEntity) session.get(CustomerEntity.class, cs_id);
			 
			 if(entity!=null) {
				 pb = new Customer();
				 pb.setCustomerId(entity.getCustomerId());
				 pb.setCustomerName(entity.getCustomerName());
				 pb.setAddress(entity.getAddress());
				 pb.setContactNumber(entity.getContactNumber());
				 }
			 else {
				 throw new Exception("No Record Found");
			 }
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(session!=null) session.close();
			if(factory!=null) factory.close();
		}
		 return pb;
		
	}
	
	/*
	
	public void updateAccount(Customer cs_id1) throws Exception{
		SessionFactory  factory = HibernateUtility.createSessionFactory();
		Session session = null;
		
		try {
			session = factory.openSession();
			
			CustomerEntity entity = (CustomerEntity) session.get(CustomerEntity.class, cs_id1.getCustomerId());	
			
			if(entity!=null) {
				cs_id1.setAddress(entity.getAddress());
				cs_id1.setCustomerName(entity.getCustomerName());
				cs_id1.setContactNumber(entity.getContactNumber());
				session.beginTransaction();
				session.update(cs_id1);
				session.getTransaction().commit();
			}else {
				throw new Exception("No Account Exists in DataBase");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(session!=null) session.close();
			if(factory!=null) session.close();
		}
		
	}
	*/
	public void deleteAccount() {
		
	}

}
