package studio1;

import java.util.Scanner;

public class Leap_Year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("The year to be tested as a leap year");
		int y = in.nextInt();
		boolean leapyear = (y % 4 == 0 && y % 100 != 0 || y % 400 == 0);
		System.out.println(leapyear);
	}

}
