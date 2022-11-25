package com.bridgelabz;

import java.util.*;

public class EmpUC8MCwage {


	static String[] empname;
	   static int [] empwage;
	   static int [] WorkingDays;
	   static int [] workingHours;
	   static int [] dailyhrs;

	    void Name(){
	     empname = new String[]{"HONDA", "YAMAHA", "TVS", "PLUSER","BULET"};
	    }

	    void Wage(){
	     empwage = new int[]{25, 35, 45, 55, 65};
	    }

	    void Days(){
	     WorkingDays = new int[]{10, 15, 20, 25, 30};
	    }

	    void Hours(){
	     workingHours = new int[]{50, 75, 100, 110, 120};
	    }

	    void Dailyhrs(){
	        dailyhrs = new  int[]{8, 8, 8, 8, 8};
	    }

	}
	
class MulEmpWage extends EmpUC8MCwage {
	
    static int totalempWage;
    int Present(int x, int y) {
        int dailyWage = x * y * 1;
        System.out.println("The daily wage is " + dailyWage);
        return dailyWage;
    }

    int Absent(int x, int y) {
        int dailyWage = x * y * 0;
        System.out.println("The daily wage is " + dailyWage);
        return dailyWage;
    }

    int Halfday(int x, int y) {
        int dailyWage = (x * y * 1) / 2;
        System.out.println("The daily wage is " + dailyWage);
        return dailyWage;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        System.out.println("Welcome to Exployee Wage");
        System.out.println("Enter the company number");
        System.out.println("0. HONDA");
        System.out.println("1. YAMAHA");
        System.out.println("2. TVS");
        System.out.println("3. PLUSER");
        System.out.println("4. BULET");

       Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int totalempWage1 = 0;
        int totalWorkinghrs = 0;
        int totalDays = 0;
        int dailyHours = 0;

        MulEmpWage obj1 = new MulEmpWage();
        EmpUC8MCwage obj = new EmpUC8MCwage();
        obj.Name();
        obj.Wage();
        obj.Days();
        obj.Hours();
        obj.Dailyhrs();

        System.out.println("The company is " + obj.empname[i]);

        while (totalWorkinghrs < obj.workingHours[i] && totalDays < obj.WorkingDays[i]) {

            int o = (int) (Math.random() * 3);

            if (o == 1) {
                totalempWage = obj1.Present(obj.dailyhrs[i], obj.empwage[i]);
                dailyHours = obj.dailyhrs[i];
                totalDays++;

            } else if (o == 2) {
                totalempWage = obj1.Absent(obj.dailyhrs[i], obj.empwage[i]);
                dailyHours = 0;

            } else {
                totalempWage = obj1.Halfday(obj.dailyhrs[i], obj.empwage[i]);
                totalDays++;
                dailyHours = (obj.dailyhrs[i])/2;
            }
            totalempWage1 = totalempWage1 + totalempWage;
            totalWorkinghrs = totalWorkinghrs + dailyHours;
        }

        System.out.println("Total empwage is " +totalempWage1);
        System.out.println("Total working days are " + totalDays);
        System.out.println("Total working hours are " + totalWorkinghrs);
       
        
		
	}

}
