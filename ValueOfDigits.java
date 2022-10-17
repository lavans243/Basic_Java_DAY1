import java.util.Scanner;
public class ValueOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create new scanner
		    Scanner input = new Scanner(System.in);

		    //Values of each digit
		    int tenThousands=0;
		    int thousands=0; 
		    int hundreds=0; 
		    int tens=0; 
		    int ones=0;

		    //Prompt user to input 5 digit number
		       
		    int n = input.nextInt();
		    if (n > 99999) {
		        System.out.println("\nError! Number more than 5 digits.");
		        }
		    else if (n < 10000) {
		        System.out.println("Error! Number less than 5 digits.");
		        }
		    else if (10000<=n&&n<=99999){
		      tenThousands = n/10000;
		            System.out.println(tenThousands);
		      thousands = (n/1000)%10;
		      System.out.println(thousands);
		      hundreds = (n%1000)/100;
		            System.out.println(hundreds);
		      tens = (n%100)/10;
		            System.out.println(tens);
		      ones = n%10;
		            System.out.println(ones);
		 


		       
		        }

		
	}

}
