package com.cg.jpastart.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		
		Department department = new Department();
		department.setId(10);
		department.setName("Salse");
		
		Department department2 = new Department();
		department2.setId(11);
		department2.setName("R&E");
		
		Employee e1 = new Employee();
		e1.setName("Ram");
		e1.setSalary(5000);
		
		Employee e2 = new Employee();
		e2.setName("Vikas");
		e2.setSalary(8000);
		
		department.addEmployee(e1);
		department2.addEmployee(e2);
		
		em.persist(department);
		em.persist(department2);
		
		System.out.println("Added");
		
		em.getTransaction().commit();

	}

}
