package application;

import java.util.Locale;
import java.util.Scanner;

public class Program07 {

	/*
		Read 2 values ​​with one decimal place (x and y), which must represent the coordinates
		of a point in a plane. Next, determine which quadrant the item belongs to.
		point, or if it is on one of the Cartesian axes or at the origin (x = y = 0).
		If the point is at the origin, write the message “Origin”.
		If the point is on one of the axes, write “X Axis” or “Y Axis”, depending on the
		situation.
	 */
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		
		double x = s.nextDouble();
		double y = s.nextDouble();
		
		if(x > 0 && y > 0)
			System.out.println("Q1");
		else 
			if(x < 0 && y > 0)
			System.out.println("Q2");
		else 
			if(x < 0 && y < 0)
			System.out.println("Q3");
		else 
			if(x > 0 && y < 0)
			System.out.println("Q4");
		else 
			if(x == 0)
			System.out.println("Y Axis");
		else 
			if(y == 0)
			System.out.println("X Axis");
		else
			System.out.println("Origin");
		s.close();
	}

}
