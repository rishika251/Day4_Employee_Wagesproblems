package com.bridgelabz.day4;
import java.util.Random;
public class UC3Parttime {
//  Add Part time Employee & Wage
//  Assume Part time Hour is 8
    public static void main(String[] args){
        int isPartTime = 1;
        int isFullTime = 2;
        int empRatePerHr = 20;
        int empHrs = 0;
        double empCheck = Math.floor(Math.random() * 10) % 3;
        if(isPartTime == empCheck) {
            empHrs = 4;
        }
        else if(isFullTime == empCheck) {
            empHrs = 8;
        }
        else{
            empHrs = 0;
        }
        int salary = (empHrs * empRatePerHr);
        System.out.println("Employee salary is:"+salary);
    }
}
