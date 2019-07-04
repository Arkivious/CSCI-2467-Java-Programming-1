/*
	Chapter :    5
	Programmer:  Arkivious Fischer
	Date:        2/25/2019
	Filename:	 CurrencyConverter.java
	Purpose:	 This project converts dollars into foreign currencies.
				 */

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class CurrencyConverter
{
			public static void main(String[] args)
			{
				// declare and construct variables

				int amount;
				double euros, pounds, rubles;
				String answer;
				DecimalFormat twoDigits = new DecimalFormat("####.00");


				//print prompts and get input
				System.out.println("\tCurrency Calculator ");
					answer = JOptionPane.showInputDialog(null, "Enter your dollar amount:");
					if (answer == null) System.exit(0);

					amount = Integer.parseInt(answer);

				 // calculations
				 euros = amount * .91;
				 pounds = amount * .64;
				 rubles = amount * 61.73;

				 // output
				 JOptionPane.showMessageDialog(null, "YOUR DOLLAR AMOUNT OF " + (twoDigits.format(amount) + "\n")+"is equal to " + (twoDigits.format(euros)+ " euros"+",\n") + (twoDigits.format(pounds) + " pounds\n")+(String.format("%,.2f", rubles) + " rubles"+".") ,  "Curreny Calculator",JOptionPane.PLAIN_MESSAGE);
			System.exit(0);
			}

}