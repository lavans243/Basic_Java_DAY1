package com.bridgelabz;

public class EmpUC6calReach {

	// To initi Constance value
			 static final int FullTime = 1; 
			    static final int PartTime = 2;
			    static final int Empwage = 20;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub



        System.out.println("Welcome to Employee wage");

        int wage = 0;
        int empHrs = 0;
        int monthlyWage = 0;
        int totalHrs = 0;
        int workingDays = 0;

        while(totalHrs<100 && workingDays<20) {
        	//Generate Random Number
            int empCheck = (int)(Math.random() * 3); 

            switch (empCheck) {
                case FullTime:
                    System.out.println("Employee doing full time");
                    empHrs = 8;
                    workingDays++;
                    break;
                    
                case PartTime:
                    System.out.println("Employee doing part time");
                    empHrs = 4;
                    workingDays++;
                    break;
                    
                default:
                    System.out.println("Employee is Absent");
                    empHrs = 0;
            }

            wage = empHrs * Empwage;
            System.out.println("Employee wage is  " + wage);
           
            totalHrs += empHrs;
            monthlyWage += wage;
        }
        System.out.println("Monthly hour " +totalHrs);
        System.out.println("Total working days  " +workingDays);
        System.out.println(" Monthly wage  " +monthlyWage);
		
			
		
		
		
	}

}
