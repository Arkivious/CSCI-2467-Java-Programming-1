/*
	Lab :    	 5
	Programmer:  Arkivious Fischer
	Date:		 2/25/2019
	Filename:	 KilowattApplet.java
	Purpose:	 This project calculates the montly cost of appliances
				 */

import java.awt.event.*;
import java.awt.*;
import java.applet.*;
import java.text.DecimalFormat;


public class KilowattApplet extends Applet implements ActionListener
{

	        //declare variables
	        double kilowatt, costKwhr, average;
			DecimalFormat twoDigits = new DecimalFormat("$####.00");


	     	//construct components
			Label companyLabel = new Label("Welcome to the Appliance Energy Calculator");
			Label costKwhrLabel = new Label("Please enter the cost per kilowatt-hour: ");
				TextField costKwhrField = new TextField(10);
			Label kilowattRunLabel = new Label("Please enter the kilowatt-hours consumed: ");
				TextField kilowattRunField = new TextField(10);
			Button calcButton = new Button("Calculate");
			Label avgCostLabel = new Label("Click the Calculate button to display the monthly energy cost.");

				public void init()
				{
					setForeground(Color.red);
					setBackground(Color.yellow);
					add(companyLabel);
					add(costKwhrLabel);
					add(costKwhrField);
					add(kilowattRunLabel);
					add(kilowattRunField);
					add(calcButton);
					calcButton.addActionListener(this);
					add(avgCostLabel);
				}

				public void actionPerformed(ActionEvent e)
				{
					//Converting to input to values
					costKwhr = Double.parseDouble(costKwhrField.getText());
					kilowatt = Double.parseDouble(kilowattRunField.getText());

					//Calculate average
					average = (costKwhr * kilowatt);

					//Output
					avgCostLabel.setText("The monthly cost to operate this appliance is " + twoDigits.format(average)+ ".");
				}
}