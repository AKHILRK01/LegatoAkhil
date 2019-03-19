  package com.login;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class HibernateUtil {

	static SessionFactory factory;
	
	public HibernateUtil() {
		
		
	}
	
	public void createSessionFactory() {
	
		factory = new Configuration().configure().buildSessionFactory();
	
	}
	
	public static SessionFactory getSessionFactory() {
	
		return factory;
	
	}
	
}
