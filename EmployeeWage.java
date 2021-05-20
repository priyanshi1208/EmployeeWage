package com.employeeWage;

import java.util.*;

public class EmployeeWage {
	public int Attendance() {
		int count = 0;
		int maxWorkingDays=20;
		for (int i = 0; i <maxWorkingDays; i++) {
			int observed = new Random().nextInt(2);
			switch (observed) {
			case 0:
				break;
			case 1:
				count++;
				break;
			}
		}
		return count;

	}

	public int dailyEmployeeWage() {
		int dailyWorkHour = 8;
		return dailyWorkHour;
	}

	public int partTimeEmployee() {
		int partTimeWorkHours = 4;
		return partTimeWorkHours;
	}

	public int monthlyWage() {
		int checkEmployeeType = new Random().nextInt(2);
		//System.out.println(checkEmployeeType);
		int presence = Attendance();
		//System.out.println(presence);
		int monthlyWage = 0;
		switch (checkEmployeeType) {
		case 0:
			monthlyWage = presence * dailyEmployeeWage();
			break;
		case 1:
			monthlyWage = presence * partTimeEmployee();
			break;
		}
		return monthlyWage;

	}

	public static void main(String[] args) {
		EmployeeWage ew = new EmployeeWage();
		System.out.println(ew.monthlyWage());
	}
}
