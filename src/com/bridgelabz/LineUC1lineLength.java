package com.bridgelabz;
import java.util.*;
public class LineUC1lineLength {
	
	static double length(int x1,int y1, int x2, int y2)
	{
        double length = Math.sqrt((double)((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1)));
        System.out.println("The line length 1 is :" + length);
        return length;
    }
}

 class Linelengthcomparison extends LineUC1lineLength 
 {
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//scanner class 
		 Scanner Sc = new Scanner(System.in);
		 
		  // UC1 line comparision get the user input 
	        System.out.println("Enter the value  X1 ");
	        int x1 = Sc.nextInt();
	        System.out.println("Enter the value  Y1 ");
	        int y1 = Sc.nextInt();
	        System.out.println("Enter the value  X2 ");
	        int x2 = Sc.nextInt();
	        System.out.println("Enter the value  Y2 ");
	        int y2 = Sc.nextInt();

	        LineUC1lineLength obj = new LineUC1lineLength();
	        obj.length(x1,y1,x2,y2);
		 
		 
	}

}
