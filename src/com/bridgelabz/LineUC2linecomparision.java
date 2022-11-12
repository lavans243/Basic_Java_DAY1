package com.bridgelabz;
import java.util.*;
 class LineUC2linecomparision {

	static double length(int x1,int y1, int x2, int y2)
	{	
        double length = Math.sqrt((double)((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1)));
        System.out.println("The line length 1 is :" + length);
        return length;
    }
	
	static double length2(int a1,int b1, int a2, int b2)
    {	
       double length2 = Math.sqrt((double)((a2 - a1) * (a2 - a1) + (b2 - b1) * (b2 - b1)));
       System.out.println("The line length 2 is :" + length2);
       return length2;
   }
	
}

 class Checkequality extends LineUC2linecomparision {
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner Sc = new Scanner(System.in);


		  // UC2 line comparision get the user input  line - 1
	        System.out.println("Enter the value  X1 in line-1");
	        int x1 = Sc.nextInt();
	        System.out.println("Enter the value Y1 in line-1");
	        int y1 = Sc.nextInt();
	        System.out.println("Enter the value  X2 in line-1");
	        int x2 = Sc.nextInt();
	        System.out.println("Enter the value Y2 in line-1");
	        int y2 = Sc.nextInt();


			  // UC2 line comparision get the user input  line-2
	        System.out.println("Enter the value a1 in line-2");
	        int a1 = Sc.nextInt();
	        System.out.println("Enter the value b1 in line-2");
	        int b1 = Sc.nextInt();
	        System.out.println("Enter the value  a2 in line-2");
	        int a2 = Sc.nextInt();
	        System.out.println("Enter the value  b2 in line-2");
	        int b2 = Sc.nextInt();

	        LineUC2linecomparision obj = new LineUC2linecomparision();
	        double l1 = obj.length(x1,y1,x2,y2);
	        double l2 = obj.length2(a1, b1,a2,b2);

	        if (l1 == l2)
	        {
	            System.out.println("The line is equal");
	        }
	        else 
	        {
	            System.out.println("The line is not equal");
	        }
		
		
	}

}
