package com.employeeWage;

public class EmployeeWage {
		public int Attendance(){
			int present=1;
			int flag;
			double observed= Math.floor(Math.random()*10)%2;
			if(present==observed) 
				flag=1;
			else
		        flag=0;
			return flag;
		}
		public int dailyEmployeeWage() {
			int dailyWage=8*20;
			int presence=Attendance();
			if(presence==1)
				return dailyWage;
			else
				return 0;
		}
		
		public static void main(String[] args){
			EmployeeWage ew= new EmployeeWage();
			System.out.println(ew.dailyEmployeeWage()); 
		}
}
