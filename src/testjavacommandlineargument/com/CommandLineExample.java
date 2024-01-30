package testjavacommandlineargument.com;

/*
In the above program, the main() method includes an array of strings named 
args as its parameter.

public static void main(String[] args) {...}
The String array stores all the arguments passed through the command line.
*/

public class CommandLineExample {

	public static void main(String[] args) {
		 System.out.println("Command-Line arguments are");

		    // loop through all arguments
		    for(String str: args) {
		      System.out.println(str);
		}
	}
}

//Note: Arguments are always stored as strings and always separated by white-space.