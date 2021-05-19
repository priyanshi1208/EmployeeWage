package com.employeeWage;

public class EmployeeWage {
		public void Attendance()
		{
			int present=1;
			double observed= Math.floor(Math.random()*10)%2;
			if(present==observed)
		        System.out.println("Employee is present");
			else
		        System.out.println("Employee is absent");
		}
		public static void main(String[] args)
		{
			EmployeeWage ew= new EmployeeWage();
			ew.Attendance();
		}
}
