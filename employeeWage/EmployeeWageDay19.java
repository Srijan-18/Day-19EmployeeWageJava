package com.employeeWage;

class EmployeeWageDay19 {
	public static void main(String args[])
	{	
		final int isPresent=1;
		System.out.println("Welcome to Employee Wage Computation Program");
		int empCheck=(int)(Math.floor(Math.random()*10)%2);
		if(empCheck==isPresent)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");
	}

}
