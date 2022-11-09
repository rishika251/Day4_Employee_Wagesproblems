package com.bridgelabz.day4;
//Calculate wages till a condition of total working hours or days is reached for a month
//Assume 100 hours and 20days
public class CalculateWages {
	 public static final int isPartTime = 1;
	    public static final int isFullTime = 2;
	    public static final int empRatePerHr = 20;
	    public static final int noOfWorkingDays = 20;
	    public static final int maxHrsInMonth = 100;

	    public static void main(String[] args) {
	        int empHrs = 0;
	        int empWage = 0;
	        int totalEmpHrs = 0;
	        int totalEmpWage = 0;
	        int totalWorkingDays = 0;
	        while (totalEmpHrs <= maxHrsInMonth && totalWorkingDays < noOfWorkingDays) {
	            totalWorkingDays++;
	            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
	            switch (empCheck) {
	                case isFullTime:
	                    empHrs = 8;
	                    break;
	                case isPartTime:
	                    empHrs = 4;
	                    break;
	                default:
	                    empHrs = 0;
	            }
	            totalEmpHrs += empHrs;
	            empWage = empHrs * empRatePerHr;
	            totalEmpWage += empWage;
	            System.out.println("Emp Wage:" + empWage);
	        }
	        System.out.println("Total Emp Wage:" + totalEmpWage);
	    }
	}

