package com.employeeWage;

class EmployeeWageDay19 
{
	public static void main(String args[])
	{	
		//constants
		final int isFullTime=1 ,isPartTime=2;
		//variables
		int empDailyWage=0, empDailyHours=0, empWagePerHour=20;
		int empMonthlyWage=0 , empWorkingHours=0, empWorkingDays=0;
		System.out.println("Welcome to Employee Wage Computation Program");
		//computation of Monthly wage
		while(empWorkingDays<=20 && empWorkingHours<100)
		{	
			int empCheck=(int)(Math.floor(Math.random()*10)%3);
			switch (empCheck)
			{
				case isFullTime :
					empDailyHours=8;
				break;
				case isPartTime :
					empDailyHours=4;
				break;
				default :
					empDailyHours=0;
			}	
		empDailyWage=empDailyHours*empWagePerHour;
		empMonthlyWage+=empDailyWage;
		empWorkingDays++;
		empWorkingHours+=empDailyHours;
		}
		System.out.println("Monthly Wage of Employee is :"+empMonthlyWage);	
	}
}
