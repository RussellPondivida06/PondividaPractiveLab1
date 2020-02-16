package com.Prog;

import java.util.*;

public class Payroll{

	private String siteName;
	private String employee;
	private String date;
	private Scanner sc;
	

	public Payroll(){
		sc = new Scanner (System.in);
		System.out.print("Please input Site Name: ");
		siteName = sc.nextLine();
		employee = "Carl Valencia";
		date = "15/02/2020";
		System.out.println("Site: "+siteName);
		System.out.println("Salary for: "+date);
	}
	
	public void salary (double rate, double daysP, double overTHrs, int Vale) {
		double salary = rate * daysP + (rate / 8 * overTHrs) - Vale ;
		System.out.println("The salary of the employee for " + date + " is "+ salary + " pesos");
	}
	
	public String getemployee() {
		return this.employee;
	}
	
	public String getdate() {
		return this.date;
	}
	
	
	public void setemployee(String employee) {
		this.employee = employee;
	}
	
	public void setdate(String date) {
		this.date = date;
	}
	
	
	
	
}
