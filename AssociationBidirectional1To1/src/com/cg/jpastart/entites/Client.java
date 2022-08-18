package com.cg.jpastart.entites;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		
		Student student = new Student();
		student.setName("Sanjay");
		
		Address homeAddress = new Address();
		homeAddress.setStreet("gvt");
		homeAddress.setCity("Gangavathi");
		homeAddress.setState("Karnataka");
		homeAddress.setZipcode("583227");
		
		student.setAddress(homeAddress);
		
		em.persist(student);
		em.getTransaction().commit();

	}

}
