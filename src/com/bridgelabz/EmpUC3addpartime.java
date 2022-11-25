package com.bridgelabz;

public class EmpUC3addpartime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// UC3 Add Part time & Calculate empwage
		
		 System.out.println("Welcome to Employee wage");

	        int empCheck = (int)(Math.random() * 3); //Generating Random Number
	        int wage = 0;
	        int isFulltime = 1;
	        int empHrs = 0;
	        int empWageperHrs = 20;
	        int isPartTime = 2;

	        if(empCheck==isFulltime){
	            System.out.println(" Employee doing full time");
	            empHrs = 8;

	        }else if(empCheck==isPartTime){
	            System.out.println("Employee doing part time");
	            empHrs = 4;
	        }else{
	            System.out.println("Employee Absent");
	            empHrs = 0;
	        }

	        wage = empHrs * empWageperHrs;
	        System.out.println("Employee wage is  "+ wage);


		
	}

}
