/**Class: BinaryDecimalConvert 
 * @author Ruben Mendez
 * @version 4.2.1
 * Course : ITEC 2150 Spring 2013 
 * Written: March 31st 2013 
 *
 *This class Ð This class converts a decimal number to a binary number 
 *
 *Purpose: Ð To convert a decimal number to a binary number
 */ 

import java.util.Scanner;
public class BinaryDecimalConvert
{
	public static String decimalToBinary(int decNumber)
	{
		//base (or terminating) case
		if (decNumber == 0) return "0";
		if (decNumber == 1) return "1";

		if(decNumber >= 0)
		{
			// the logic that coverts from decimal to binary
			return decimalToBinary(decNumber / 2) + decNumber % 2 + "" ;
			//decimalToBinary((decNumber % 2 ));
		}
		else
			return null;
	}
	//main method that asks to input the number we want to convert to binary.
	public static void main(String[] args) 
	{
		int input;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number to convert to binary: ");
		input = scan.nextInt();
		String x = decimalToBinary(input);
		System.out.println(x);

	}
}


