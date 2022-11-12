package com.bridgelabz;

public class EmpUC4switchcase {

	// To init constant value
	static final int FullTime = 1; 
    static final int PartTime = 2;
    static final int Empwage = 20;	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//UC 4 Switch statement & Calculate Emp Wage

        System.out.println("Welcome to Employee wage");

        int empCheck = (int)(Math.random() * 3); //Generate Random Number
        int wage = 0;
        int empHrs = 0;

        switch (empCheck){
            case FullTime :
                System.out.println("Employee  doing full time");
                empHrs = 8;
                break;
            case PartTime:
                System.out.println("Employee doing part time");
                empHrs = 4;
                break;
            default:
                System.out.println("Employee is Absent");
                empHrs = 0;
        }

        wage = empHrs * Empwage;
        System.out.println("Employee wage is  "+ wage);
   
		
		
	}

}
