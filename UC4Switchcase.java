package com.bridgelabz.day4;
//solve using switch case
public class UC4Switchcase {
	 public static final int isPartTime = 1;
	    public static final int isFullTime = 2;
	    public static final int emRatePerHr = 20;

	    public static void main(String[] args){
	        int empHrs = 0;
	        int empWage = 0;
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
	        empWage = (empHrs * emRatePerHr);
	        System.out.println("Employee salary is:"+empWage);
	    }
	}

