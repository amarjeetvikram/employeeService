package com.home.employeService.dao;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Table(name="employe_data")
@Entity
public class EmployeeEntity 
{
	@Id
	@Column(name="id")
	@GeneratedValue
	private long id;
	@Column(name="gen")
	private char gender;
	@Column(name="bday")
	private Date bdate ;
	@Column(name="sal")
	private int salary;
	@Column(name="sal_b")
	private int salbegin ;
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public Date getBdate() {
		return bdate;
	}
	public void setBdate(Date bdate) {
		this.bdate = bdate;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getSalbegin() {
		return salbegin;
	}
	public void setSalbegin(int salbegin) {
		this.salbegin = salbegin;
	}
	@Override
	public String toString() {
		return "EmployeeEntity [id=" + id + ", gender=" + gender + ", bdate=" + bdate + ", salary=" + salary
				+ ", salbegin=" + salbegin + "]";
	}
	
	
	
	
	
	
}
