/*
 * programmer: Arkivious Fischer
 * Assignment: Lab11
 * filename: Candleline.java
 * date: 	4/22/2019
 * Program:  The purpose of the program is to calculate shipping cost by type.
 */

import java.text.DecimalFormat;
import java.util.*;


public class Candleline{


     public static void main(String[] args)

     {
		 //Declare varibles
         double candleCost, shippingCost;
         int shippingType;


		 //Title of program
		 System.out.println("\t\tCandleLine - Candles Online\n");

         //call methods
		 candleCost = getCandlecost();
		 shippingType = getShippingType();
		 shippingCost = getShippingCost(candleCost, shippingType);
		 output(candleCost, shippingCost);
}

    public static double getCandlecost()
    {

        // create a Scanner object
        Scanner sc = new Scanner(System.in);
        double candleCost = 0;
        boolean done = false;

        // infinite loop

        while(!done){
		// try - catch to check for exception
			try{
				 System.out.print("Enter the cost of the candle order : ");
			 	 candleCost = sc.nextDouble();

               if(candleCost <= 0)
				 throw new InputMismatchException();

               done = true;
		   }
		    catch(InputMismatchException e) {
		    System.out.println("Error, enter a dollar amount greater than 0");
		    sc.nextLine();
		}
}

            return candleCost;

        }



    public static int getShippingType()

    {
		Scanner sc = new Scanner(System.in);
		int shippingType = 0;
		boolean done = false;

        // infinite loop
		 while(!done) {
		 // try - catch to check for exception
			  try{
				System.out.print("\nEnter the type of shipping:\n 1> Priority <Overnight>\n 2> Express <2 Business Days>\n 3> Standard <3 to 7 Business Days>\nEnter type number: ");
				shippingType = sc.nextInt();

				if(shippingType < 1 || shippingType >3)
					throw new InputMismatchException();

				done = true;
			}

            catch(InputMismatchException ex){
				System.out.println("\nError, enter a 1, 2 or 3");
				sc.nextLine();
				}
		}
		return shippingType;
}


    public static double getShippingCost(double candleCost, int shippingType)
    {

        // Priority shipping
		if(shippingType == 1)
		return 16.95;

        // Express shipping
		else if(shippingType == 2)
		return 13.95;

        // standard shipping
		else
		{

		// 100.00 and above on standard shipping will receive free shipping
		if(candleCost >= 100.0)
		  return 0;
		 else
		  return 7.95;
 }

    }
 	public static void output(double candleCost, double shippingCost)
 	{
		DecimalFormat twoDigits = new DecimalFormat("$#,###.00");

		System.out.println();
    	System.out.println("The candle cost of " + twoDigits.format(candleCost) + " plus shipping cost of " + twoDigits.format(shippingCost) + " equals " +  twoDigits.format(candleCost + shippingCost));

     }
}