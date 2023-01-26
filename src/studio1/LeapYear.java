package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int year = in.nextInt();
		//boolean leapYear = ((double) (year / 4)=) &&4
		boolean leapYear1 = year % 4 == 0;
		boolean leapYear2 =  year % 100 != 0; 
		boolean leapYear3 =  year % 400 == 0;
		boolean leapYear = (leapYear1 == true && leapYear2 == true) || leapYear3 == true;
		System.out.println (year + " is a leap year: " + leapYear);

	}

}
