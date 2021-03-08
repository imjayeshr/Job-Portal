/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.me.JobPortal.pojo;

/**
 *
 * @author joaey
 */
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "Employer_Table")
@PrimaryKeyJoinColumn(name = "employeeID")
public class Employer extends User {

//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	@Column(name = "employerID", unique=true, nullable = false)
//	private int empID;
//	
//	@ManyToOne(cascade = CascadeType.ALL)
//	@Column(name = "company_id")
	private Company company;
	
	public Employer(){	
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}
	
	
	
	
}