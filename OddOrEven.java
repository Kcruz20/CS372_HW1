import java.util.Scanner;

public class OddOrEven {
	public static void main (String [] args) {
	System.out.println("Please enter a number between 10 and 100");
	Scanner input = new Scanner (System.in);
	int inNum = input.nextInt();
	
	if (inNum < 10 || inNum > 100) {
		//PT -- loop so that the user cna try again, rather than exiting the program
		System.out.println ("Your number is invalid\n");
	}
	else
		//PT -- 1 is always less than inNum, so this will run forever. i < inNum. -2
			for (int i=0; 1 < inNum; i++) {
				System.out.print(i);
		if (i%2 == 0 )
			System.out.println(i + "is even ");
		else
			System.out.println(i+ " is odd ");
		}
	}
	}
