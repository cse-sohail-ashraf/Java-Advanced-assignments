package com.capgemini.hibernateOneToOne;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class App {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPersistenceUnit");
		EntityManager em = emf.createEntityManager();
		
		try {
			em.getTransaction().begin();
			Account account = new Account("ACC12345","Savings");
			Customer customer = new Customer("sohail",account);
			em.persist(customer);
			
			//set bi-directional relationship
			account.setCustomer(customer);
			//Persist customer(account will also persist if cascade is used)
			em.persist(customer);
			//Commit transaction
            em.getTransaction().commit();
            System.out.println("Customer and Account saved succesfully");
		}catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
            emf.close();
        }
	}
}
