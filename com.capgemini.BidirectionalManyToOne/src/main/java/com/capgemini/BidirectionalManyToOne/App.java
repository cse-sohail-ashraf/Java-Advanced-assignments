package com.capgemini.BidirectionalManyToOne;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class App {
    public static void main(String[] args){
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPersistenceUnit");
    	EntityManager em = emf.createEntityManager();
    	
    	try {
    		em.getTransaction().begin();
    		Department department = new Department("CSE");
    		Student s1 = new Student("Sohail",department);    		
    		Student s2 = new Student("Ashraf",department);
    		
    		department.addStudent(s1);
    		department.addStudent(s2);
    		
    		em.persist(department);
    		
    		em.getTransaction().commit();
    		
    		System.out.println("Data inserted Successfully");
    		
    	}catch(Exception e) {
    		System.out.println(e.getMessage());
    		e.printStackTrace();
    		em.getTransaction().rollback();
    	}finally {
    		em.close();
    		emf.close();
    	}
    }
}
