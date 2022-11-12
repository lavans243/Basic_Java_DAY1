package com.bridgelabz;

public class EmpUC5calMonth {
	

    static final int FullTime = 1; 
    static final int PartTime = 2;
    static final int Empwage = 20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		 //Use case 5 code with Switch statement

       System.out.println("Welcome to Employee wage");

       int wage = 0;
       int empHrs = 0;
       int monthlyWage = 0;

       for(int i = 0; i<20; i++) {
       	
//to generate random number
           int empCheck = (int)(Math.random() * 3); 
           switch (empCheck) {
           
               case FullTime:
                   System.out.println("Employee doing full time");
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
           System.out.println("Employee wage is  " + wage);
        
           monthlyWage += wage;
       }
       System.out.println(monthlyWage);
		
		
		
	}

}
