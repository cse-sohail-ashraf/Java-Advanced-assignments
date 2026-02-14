package com.capgemini.EmployeeOneToOne;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class App {
    public static void main(String[] args){
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPersistenceUnit");
    	EntityManager em = emf.createEntityManager();
    	
    	try {
    		em.getTransaction().begin();
    		
    		Locker locker = new Locker(101,5);
    		Employee employee = new Employee("sohail","CSE",locker);
    		
    		employee.setLocker(locker);
    		em.persist(employee);
    		em.getTransaction().commit();
    	}catch(Exception e) {
    		System.out.println(e.getMessage());
    		e.printStackTrace();
    	}
    }
}
