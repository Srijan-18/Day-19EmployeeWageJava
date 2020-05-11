package com.employeeWage;

class EmployeeWageDay19 {
	public static void main(String args[])
	{	
		final int isPresent=1 ,isPartTime=2;
		int empDailyWage=0, empDailyHours=0, empWagePerHour=20;
		System.out.println("Welcome to Employee Wage Computation Program");
		int empCheck=(int)(Math.floor(Math.random()*10)%3);
		if(empCheck==isPresent)
		{	
			System.out.println("Employee is Present");
			empDailyHours=8;
		}	
		else if(empCheck==isPartTime)
		{
			System.out.println("Employee is present part time");
			empDailyHours=4;
		}
		else
			System.out.println("Employee is Absent");
		empDailyWage=empDailyHours*empWagePerHour;
		System.out.println("Today's Wage of Employee is :"+empDailyWage);
	}

}
