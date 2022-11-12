package com.bridgelabz;

public class EmpUC2Dwage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// uC2
				// to check and calculate the daily wage
				 System.out.println("Welcome to Employee wage");

			        int empCheck = (int)(Math.random() * 2);
			        int wage = 0;
			        int isFulltime = 1;
			        int empHrs = 0;
			        int empWageperHrs = 20;

			        if(empCheck==isFulltime){
			            System.out.println("The employee is present");
			            empHrs = 8;


			        }else{
			            System.out.println("Employee is Absent");
			            empHrs = 0;
			        }

			        wage = empHrs * empWageperHrs;
			        System.out.println("Employee wage is  "+ wage);
		
	}

}
