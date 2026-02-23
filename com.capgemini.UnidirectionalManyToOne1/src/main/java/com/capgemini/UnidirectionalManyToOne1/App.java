package com.capgemini.UnidirectionalManyToOne1;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args){
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPersistenceUnit");
    	EntityManager em = emf.createEntityManager();
    	
    	try {
    		em.getTransaction().begin();
    		Customer customer = new Customer("sohail","sohail.rcom6@gmail.com");
    		Order order1 = new Order("24-09-2025",1200,customer);
    		Order order2 = new Order("04-03-2025",2200,customer);
    		em.persist(customer);
    		em.persist(order1);
    		em.persist(order2);
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
