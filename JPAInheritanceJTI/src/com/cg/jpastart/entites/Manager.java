package com.cg.jpastart.entites;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="mgr_store")
public class Manager extends Employee{
	
	private static final long serialVersionUID=1L;
	
	private String departementName;

	public String getDepartementName() {
		return departementName;
	}

	public void setDepartementName(String departementName) {
		this.departementName = departementName;
	}

}
