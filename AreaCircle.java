import java.util.Scanner;

public class AreaCircle {
	public static void main (String [] args) {
		final double PI = 3.14;
		System.out.println ("Please enter the radius of a circle");
		Scanner input = new Scanner(System.in);
		double radius = input.nextInt();
		double CircleArea = (radius * radius * PI);
		System.out.println("area of the circle is " + CircleArea);
	}
}