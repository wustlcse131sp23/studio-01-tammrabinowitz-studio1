package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n1 = in.nextInt();
		int n2 = in.nextInt();
		double average = (n1 + (double)n2)/2;
		System.out.println("The average of " + n1 + " and " + n2 + " is " + average);

	}

}
