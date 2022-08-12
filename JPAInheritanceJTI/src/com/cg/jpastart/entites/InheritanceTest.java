package com.cg.jpastart.entites;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InheritanceTest {

	public static void main(String[] args) {
		
		EntityManagerFactory factery = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factery.createEntityManager();
		em.getTransaction().begin();
		
		//Create one employee
		Employee employee = new Employee();
		employee.setName("Sanjay");
		employee.setSalary(50000);
		em.persist(employee);
		
		//Create one manager
		Manager manager = new Manager();
		manager.setName("Vikas");
		manager.setSalary(80000);
		manager.setDepartementName("Sales");
		em.persist(manager);
		
		em.getTransaction().commit();
		
		System.out.println("Added one employee and manager to database.");
		//em.clear();
		//factery.close();

	}

}
