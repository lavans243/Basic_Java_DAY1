import java.util.*;
public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number: ");

		int num = scanner.nextInt();
		int count=0;
		int num2 = 1;
		 
				 //0 false
		while( num != 0)
		{			
						//50/10 = 5
						//5/10 = 0
				num = num/10;
				//num = 0;
				//num = 5
				count++;
				
		}
				System.out.println("Number of digits: "+count);
				
		do{
			System.out.println(num2); // 1 ,2,3
			num2++;
			//num2 = 3
		}while(num2 < 10);
				//true
				String name = "brigde";
								//sysout(num); // 20						
	          name = "bridge2";
		
		System.out.println(name);
		
		
	}

}
