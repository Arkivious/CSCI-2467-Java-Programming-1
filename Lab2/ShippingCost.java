/*
	Lab:		2
	Programmer: Arkivious Fischer
	Date: 		1/28/2019
	Filename:   ShippingCost.java
	Course: 	CSCI 2467
	Purpose:    Calculating the cost of shipping by package weight
*/

import java.util.Scanner;

public class ShippingCost
{

	public static void main(String[]args)
	{
		 //declaring objects//
		double costInDollars;

		Scanner input=new Scanner(System.in);

		//prompt the user to enter the weight of the package//

		System.out.print("Enter the package weight: ");
		double weight=input.nextDouble();

		//Calculate the cost of shipping//
		if(weight>20)
			System.out.println("The package cannot be shipped.");
		else
		{
			           if (weight <= 1)
			               costInDollars = 3.50;
			           else if (weight <= 3)
			               costInDollars = 5.50;
			           else if  (weight <= 10)
			               costInDollars = 8.50;
			           else	//if (weight <= 20)//
			               costInDollars = 10.50;
			           System.out.println("The shipping cost is $" + costInDollars);

			       }
			   }
}


