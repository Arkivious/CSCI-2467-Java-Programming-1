/*
   Lab 			   3
   Programmer:	   Arkivious Fischer
   Date:		   02/4/2019
   Program Name:   EmployeePayStub.java
   Purpose:		   Calculating employee payroll
*/
import java.util.Scanner;
import java.text.DecimalFormat;

public class EmployeePayStub
{
   	public static void main(String[] args)
   	{
	   	//Declaring Variables
		int hoursWorked;
	   	double payRate, federalTax, stateTax, grossPay, netPay, deductions;
	   	String employeeName;

		//instantiating scanner method
	   	Scanner input = new Scanner(System.in);

		//instantiating decimal format
	   	DecimalFormat twoD = new DecimalFormat("$#,###.00");
	   	DecimalFormat oneD = new DecimalFormat("###.0");
	   	DecimalFormat percent = new DecimalFormat("<##.0%>");

		//Title
		System.out.print("\t\t\tPayroll Record\t\t\t");
		 System.out.println();
		 System.out.println();

	   //Get Input from User
		System.out.print("Enter employee's name: ");
		  employeeName = input.nextLine();
		System.out.print("Enter number of hours worked in a week:  ");
		  hoursWorked = input.nextInt();
		System.out.print("Enter hourly pay rate:  ");
		  payRate = input.nextDouble();
		System.out.print("Enter federal tax withholding rate:  ");
	      federalTax = input.nextDouble();
		System.out.print("Enter state tax withholding rate:  ");
		  stateTax = input.nextDouble();
		  System.out.println();

		//generate inputs with employee pay
		System.out.println("Employee Name:" +            (employeeName));
		System.out.println("Hours Worked:  " + oneD.format(hoursWorked));
		System.out.println("Pay Rate:     " + twoD.format(payRate));
		System.out.println("Gross Pay:    " + twoD.format(hoursWorked*payRate));
		System.out.println("Deductions:");

		// Calculations
		grossPay = hoursWorked*payRate;
		deductions = grossPay*federalTax+grossPay*stateTax;

		//Output
		System.out.println("  Federal Withholding " + ((percent.format(federalTax)) + ": " + twoD.format((grossPay/((1/federalTax))))));
		System.out.println("  State Withholding " + ((percent.format(stateTax)) + ": " + twoD.format((grossPay/((1/stateTax))))));
		System.out.println("  Total Deduction :\t" + twoD.format((deductions)));

		//Net pay
		System.out.println("Net Pay: " +   twoD.format(grossPay-deductions));
		System.out.println();

   	}
}