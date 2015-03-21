/**Class: BinaryDecimalConvert 
 * @author Ruben Mendez
 * @version 4.2.1
 * Course : ITEC 2150 Spring 2013 
 * Written: March 31st 2013 
 *
 *This class Ð This class converts a binary number to a decimal number 
 *
 *Purpose: Ð To convert a binary number to a decimal number.
 */ 

import java.util.Scanner;

public class Binary2Dec
{
	//sets the initial power and answer to 0.
	static int power = 0;
	static int answer = 0;
	public static int Binary2Dec(String binaryNumber, int power)
	{


		//if the binary number length is less than 1 return answer
		if (binaryNumber.length()<1) return answer;
		else
		{
			//creates a parseint that lets you go back on the substring.
			int num = Integer.parseInt(binaryNumber.substring(binaryNumber.length()-1));
			//logic for converting from binary to decimal.
			answer += num * (Math.pow(2,power));
			return Binary2Dec(binaryNumber.substring(0, binaryNumber.length()-1), power + 1);
		}
	}
	//main method that lets you input the binary number you want to convert to decimal
	public static void main(String[] args) 
	{
		String input;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number to convert decimal: ");
		input = scan.nextLine();
		int x= Binary2Dec(input, power);
		System.out.println(x);

	}
}