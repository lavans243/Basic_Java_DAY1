
public class CmdArgument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.out.println("Command-Line arguments are");

		    // loop through all arguments
		    for(String str: args) {
		      System.out.println(str);
		
	}
		    //type2
		    
		    if (args.length > 0) {
		    	 
	            // Print statements
	            System.out.println("The command line"
	                               + " arguments are:");
	 
	            // Iterating the args array
	            // using for each loop
	            for (String val : args)
	 
	                // Printing command line arguments
	                System.out.println(val);
	        }
	 
	        else
	 
	            // Print statements
	            System.out.println("No command line "
	                               + "arguments found.");

		 
}
}
