package com.login;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class UsersDAO {

	public boolean addUsers(int name,String passw) {
		
		
		SessionFactory factory = HibernateUtil.getSessionFactory();
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		LoginDetails checkObject = session.get(LoginDetails.class, name);
		
		if(checkObject == null) {
		LoginDetails Login  = new LoginDetails();
		Login.setUserId(name);
		Login.setPassword(passw);
		
		System.out.println("object "+Login);

		session.save(Login);
		
		tx.commit();
		session.close(); 
		return true; 
		}
		else {
			return false;}
	}

	public void addCustomer(Customer customer) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		
		session.save(customer);
		
		tx.commit();
		session.close(); 
		
	}

	public List<Customer> getCustomer(int userId) {
		List<Customer>  customers = new ArrayList<Customer> ();
		SessionFactory factory = HibernateUtil.getSessionFactory();

		Session session = factory.openSession();
		
		customers=session.createQuery("from Customer where userId='"+userId+"'").list();
		session.close();
			
		return customers;
	}

	public List<Customer> getCustomer() {
		List<Customer>  customers = new ArrayList<Customer> ();
		SessionFactory factory = HibernateUtil.getSessionFactory();

		Session session = factory.openSession();
		
		customers=session.createQuery("from Customer").list();
		session.close();
			
		return customers;
	}

	public List<LoginDetails> getUserId() {
		List<LoginDetails>  userId = new ArrayList<LoginDetails> ();
		SessionFactory factory = HibernateUtil.getSessionFactory();

		Session session = factory.openSession();
		
		userId=session.createQuery("select userId from LoginDetails").list();
		session.close();
			
		return userId;
	}


	

}
