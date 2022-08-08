package org.sample1;

import org.testng.annotations.Test;

public class EmployeeDetails {
	
	@Test
	private void empId() {
		
		System.out.println("Employee ID is 88565");
	}
	
	private void empName() {
		
		System.out.println("Employee Name is vinoth");
	}
	
	private void empDob() {
		System.out.println("Employee DOB is 17 May,1996");
	}
	
	public static void main(String[] args) {
		
		EmployeeDetails emp = new EmployeeDetails();
		
		emp.empName();
		emp.empId();
		emp.empDob();
	}

}
