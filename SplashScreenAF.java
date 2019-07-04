/*
	Chapter 1: Lab 1
	Programmer: Arkivious Fischer
	Date: Janurary 21, 2019
	Filename: SplashScreen
	Purpose: This screen will generate user's information along with current time and date.
*/

import java.util.Date;

public class SplashScreenAF{

public static void main(String[]args)
{
		//instantiated date object
		Date date = new Date();

		//Created a console splash screen with random information of a user by using spaces
		System.out.println("**************************************************");
		System.out.println("*                                                *");
		System.out.println("*             *      * * * *   * * * *           *");
		System.out.println("*            * *     *      *  *                 *");
		System.out.println("*           *   *    *      *  * * * *           *");
		System.out.println("*          *  *  *   *      *  *                 *");
		System.out.println("*         *       *  * * * *   *                 *");
		System.out.println("*                                                *");
		System.out.println("*           Arkivious D. Fischer                 *");
        System.out.println("*           586 Blanco Sierra Drive              *");
		System.out.println("*           Pheonix, AZ 85322                    *");
		System.out.println("*           email: Fischer29@gmail.com           *");
		System.out.println("*                                                *");
		System.out.println("*   Today\'s "+"Date"+" "+(date.toString())+""+ "    *" ); //output date time and year
		System.out.println("*                                                *");
		System.out.println("**************************************************");

	}
}