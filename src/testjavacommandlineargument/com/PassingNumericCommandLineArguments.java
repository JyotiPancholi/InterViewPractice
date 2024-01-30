package testjavacommandlineargument.com;
/*
The main() method of every Java program only accepts string arguments.
Hence it is not possible to pass numeric arguments through the command line.

However, we can later convert string arguments into numeric values.
*/

public class PassingNumericCommandLineArguments {

	public static void main(String[] args) {
		 for(String str: args) {
		      // convert into integer type
		    int argument = Integer.parseInt(str);
		    System.out.println("Argument in integer form: " + argument);
		 }
	}
}
/*
Note: If the arguments cannot be converted into the specified numeric value 
then an exception named NumberFormatException occurs.
*/