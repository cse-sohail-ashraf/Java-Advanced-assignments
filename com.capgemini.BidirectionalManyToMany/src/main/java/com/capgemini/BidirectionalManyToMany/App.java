package com.capgemini.BidirectionalManyToMany;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class App{
    public static void main(String[] args){
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPersistenceUnit");
    	EntityManager em = emf.createEntityManager();
    	
    	try {
    		em.getTransaction().begin();
    		
    		Project p1 = new Project("Banking System");
    		Project p2 = new Project("Insurance System");
    		
    		Set<Project> projectSet = new HashSet<>();
    		projectSet.add(p1);
    		projectSet.add(p2);
    		
    		Employee emp1 = new Employee("John",projectSet);
    		Employee emp2 = new Employee("Sara",projectSet);
    		
    		Set<Employee> employeeSet = new HashSet<>();
    		employeeSet.add(emp1);
    		employeeSet.add(emp2);
    		
    		p1.setEmployees(employeeSet);
    		p2.setEmployees(employeeSet);
    		
    		em.persist(emp1);
    		em.persist(emp2);
    		
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
