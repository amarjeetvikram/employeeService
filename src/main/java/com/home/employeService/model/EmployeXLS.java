package com.home.employeService.model;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class EmployeXLS 
{
	private char gender;
	private Date bdate ;
	private int salary;
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
		return "EmployeXLS [gender=" + gender + ", bdate=" + bdate + ", salary=" + salary + ", salbegin=" + salbegin
				+ "]";
	}
	
	
	
}
