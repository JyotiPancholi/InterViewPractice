package test_recursion.com;

//Write a Java program to convert Decimal to binary using recursion?

public class DecimalToBinary {
	 static int calculateBin(int dec)
	    {
	        if (dec == 0)
	         return 0;
	        else
	         return (dec%2) + (10*(calculateBin(dec/2)));
	    }
	public static void main(String[] args) {
        int dec = 786;
        int bin = calculateBin(dec);
        System.out.println("The binary form of the decimal number "+dec+" is: "+bin);
    }
}

