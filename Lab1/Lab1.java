/*
	Lab:	    1
	Programmer: Arkivious Fischer
	Date:		1/20/2019
	Filename:	Lab1.java
	course:		CSCI 2467
	Purpose:	To create a console app using the scanner method to do arithmetic
*/

import java.util.Scanner;

//class name
public class Lab1
{
	// main method
	public static void main(String[] args)
	{
		//Declaring variables
		int int1, int2;
		double firstReal, secondReal;

		//initializing scanner
		Scanner in = new Scanner(System.in);

		//Display title of program
		System.out.println(" *********************************** ");
		System.out.println(" *  this is my first Java program  * ");
		System.out.println(" *********************************** ");
		System.out.println();

		//used blank line to separate segments of the code

		System.out.println("**    Integer arithmetic tests    **");
		System.out.println();

		//User is promoted to input integer
		System.out.print("Enter the first integer to test:  ");
		int1 = in.nextInt();
		System.out.print("Enter the second integer to test:  ");
		int2 = in.nextInt();

		//Basic arithmetic using proper spacing on both side of binary operators
		System.out.println(int1 + " + " + int2 + " = " + (int1 + int2));
		System.out.println(int1 + " - " + int2 + " = " + (int1 - int2));
		System.out.println(int1 + " * " + int2 + " = " + (int1 * int2));
		System.out.println(int1 + " / " + int2 + " = " + (int1 / int2));
		System.out.println(int1 + " % " + int2 + " = " + (int1 % int2));
		System.out.println();

		//second title display
		System.out.println("**    Real arithmetic tests    **");
		System.out.println();

		//user prompt to enter double
		System.out.print("Enter the first real to test:  ");
		firstReal = in.nextDouble();
		System.out.print("Enter the second real to test:  ");
		secondReal = in.nextDouble();

		//basic arithmetic for doubles
		System.out.println(firstReal + " + " + secondReal + " = " + (firstReal + secondReal));
		System.out.println(firstReal + " - " + secondReal + " = " + (firstReal - secondReal));
		System.out.println(firstReal + " * " + secondReal + " = " + (firstReal * secondReal));
		System.out.println(firstReal + " / " + secondReal + " = " + (firstReal / secondReal));
		System.out.println();

	}
}
