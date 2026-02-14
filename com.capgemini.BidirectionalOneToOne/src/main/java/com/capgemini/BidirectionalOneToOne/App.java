package com.capgemini.BidirectionalOneToOne;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class App {
    public static void main(String[] args){
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPersistenceUnit");
    	EntityManager em = emf.createEntityManager();
    	
    	try {
    		em.getTransaction().begin();
    		
    		Passport passport = new Passport(101,"25-12-2013","24-12-2023");
    		Person person = new Person("sohail","24-09-2003",passport);
    		em.persist(person);
    		
    		passport.setPerson(person);
    		
    		em.getTransaction().commit();
    	}catch(Exception e) {
    		System.out.println(e.getMessage());
    		e.printStackTrace();
    	}finally {
    		em.close();
    		emf.close();
    	}
    	
    	
    }
}
