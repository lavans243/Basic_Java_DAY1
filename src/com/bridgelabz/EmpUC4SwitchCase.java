package com.bridgelabz;

public class EmpUC4SwitchCase {
	
	// To init constant value
	static final int IS_FULL_TIME = 1; 
    static final int IS_PART_TIME = 2;
    static final int EMP_WAGE_HRS = 20;	
	
	public static void main(String[] args) {
		
		//UC 4 Switch statement & Calculate Emp Wage

        System.out.println("Welcome to Employee wage");

        int empCheck = (int)(Math.random() * 3); //Generate Random Number
        int wage = 0;
        int empHrs = 0;

        switch (empCheck){
            case IS_FULL_TIME :
                System.out.println("Employee  doing full time");
                empHrs = 8;
                break;
            case IS_PART_TIME:
                System.out.println("Employee doing part time");
                empHrs = 4;
                break;
            default:
                System.out.println("Employee is Absent");
                empHrs = 0;
        }

        wage = empHrs * EMP_WAGE_HRS;
        System.out.println("Employee wage is  "+ wage);
   
		

	}

}
