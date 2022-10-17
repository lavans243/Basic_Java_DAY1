import java.util.Scanner;
public class SpringSeason {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);

	    int month = scan.nextInt();
	    int day = scan.nextInt();

	    if((month == 12 && day >= 16 && day <= 31) || (month == 1 && day >=1 && day <= 31) || (month == 2 && day >= 1 && day <= 28) || (month == 3 && day >=1 && day <=15))
	    {
	        System.out.println("Winter");
	    }
	    else if((month == 3 && day >= 16 && day <= 31) || (month == 4 && day >=1 && day <= 30) || (month == 5 && day >= 1 && day <= 31) || (month == 6 && day >=1 && day <=15))
	    {
	        System.out.println("Spring");
	    }
	    else if((month == 6 && day >= 16 && day <= 30) || (month == 7 && day >=1 && day <= 31) || (month == 8 && day >= 1 && day <= 31) || (month == 9 && day >=1 && day <=15))
	    {
	        System.out.println("Summer");
	    }
	    else if((month == 9 && day >= 16 && day <= 30) || (month == 10 && day >=1 && day <= 31) || (month == 11 && day >= 1 && day <= 30) || (month == 12 && day >=1 && day <=15))
	    {
	        System.out.println("Fall");
	   
   }
	    }
}
