package com.bridgelabz;

import java.util.Scanner;

public class LineUC4oops {

	
	static double length(int x1,int y1, int x2, int y2){
        double length = Math.sqrt((double)((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1)));
        System.out.println("The line length 1 is :" + length);
        return length;
    }
	static double length2(int a1,int b1, int a2, int b2)
	{	
        double length2 = Math.sqrt((double)((a2 - a1) * (a2 - a1) + (b2 - b1) * (b2 - b1)));
        System.out.println("The line length 1 is :" + length2);
        return length2;
    }
		
}

  class LineOops extends LineUC4oops {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// scannar class
				Scanner Sc = new Scanner(System.in);

				  // UC4 line comparision get the user input  line - 1
		        System.out.println("Enter the value of X1 in line 1");
		        int x1 = Sc.nextInt();
		        System.out.println("Enter the value of Y1 in line 1");
		        int y1 = Sc.nextInt();
		        System.out.println("Enter the value of X2 in line 1");
		        int x2 = Sc.nextInt();
		        System.out.println("Enter the value of Y2 in line 1");
		        int y2 = Sc.nextInt();

				  // UC4 line comparision get the user input  line - 2
		        System.out.println("Enter the value of a1 in line 2");
		        int a1 = Sc.nextInt();
		        System.out.println("Enter the value of b1 in line 2");
		        int b1 = Sc.nextInt();
		        System.out.println("Enter the value of a2 in line 2");
		        int a2 = Sc.nextInt();
		        System.out.println("Enter the value of b2 in line 2");
		        int b2 = Sc.nextInt();

		     LineUC4oops obj = new LineUC4oops();
	        double l1 = obj.length(x1,y1,x2,y2);
	        double l2 = obj.length2(a1, b1,a2,b2);
	       
	        String ln1 = Double.toString(l1);
	        String ln2 = Double.toString(l2);

	        if (ln1.compareTo(ln2) < 0) 
	        {
	            System.out.println(" Line-1 is grater than line-2");
	   
	     } else if (ln1.compareTo(ln2) > 0)
	     {
	            System.out.println("Line-1 is shorter than line-2");
	        } else if (ln1.compareTo(ln2) == 0)
	        {
	            System.out.println("Both lines are equal ");
	        }
	}

}
