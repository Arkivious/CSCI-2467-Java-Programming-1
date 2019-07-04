/*
   Lab 			   3
   Programmer:	   Arkivious Fischer
   Date:		   02/4/2019
   Program Name:   City.java
   Purpose:		   Displaying cities in ascending order
*/

import java.util.Scanner;

public class City{

	public static void main(String[]args)
	{
		//instantiate scanner
		Scanner input = new Scanner(System.in);

		//title of the program
		System.out.println("\t\tAscending Order");
		System.out.println();

		// Prompt the user to enter three cities
		System.out.print("Enter the first city: ");
		String city1 = input.nextLine();
		System.out.println();
		System.out.print("Enter the second city: ");
		String city2 = input.nextLine();
		System.out.println();
		System.out.print("Enter the third city: ");
		String city3 = input.nextLine();
		System.out.println();

		//declare variable
		String temp;

		//conditional for comparing cities
		if ((city1.compareTo(city2) > 0 )){
		temp = city1;
		city1 = city2;
		city2 = temp;
		}
		if ((city2.compareTo(city3) > 0)){
		temp = city2;
		city2 = city3;
		city3 = temp;

		}
		if ((city1.compareTo(city2) > 0)){
		temp = city1;
		city1 = city2;
		city2 = temp;
		}

		// Cities displayed in Ascending order
		System.out.println("The three cities in alphabetical order are " +
		city1 + " " + city2 + " " + city3);
		System.out.println();
	}
}