package com.bridgelabz.day4;
//Check Employee is Present or Absent
//Use ((RANDOM)) for Attendance Check

public class UC1PresentAbsent {
	 public static void main(String[] args){
	        double random = Math.random();
	        System.out.println(random);
	        if(random>0.5) {
	            System.out.println("Employee is present");
	        }
	        else {
	            System.out.println("Employee is absent");
	        }
	    }

	}

