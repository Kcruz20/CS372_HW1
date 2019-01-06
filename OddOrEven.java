import java.util.Scanner;

public class OddOrEven {
	public static void main (String [] args) {
	System.out.println("Please enter a number between 10 and 100");
	Scanner input = new Scanner (System.in);
	int inNum = input.nextInt();
	
	if (inNum < 10 || inNum > 100) {
		System.out.println ("Your number is invalid\n");
	}
	else
			for (int i=0; 1 < inNum; i++) {
				System.out.print(i);
		if (i%2 == 0 )
			System.out.println(i + "is even ");
		else
			System.out.println(i+ " is odd ");
		}
	}
	}