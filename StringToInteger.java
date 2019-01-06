import java.util.Scanner;
public class StringToInteger {
	public static void main(String[] args) {
		System.out.println ("Please enter a number");
		Scanner input = new Scanner(System.in);
		String uNum = input.next();
		int Num = uNum.charAt(0);
		
		if(Num > 57)
			System.out.println ("Please enter a number");
		else if (Num < 48)
			System.out.println("please enter a number");
		else 
			System.out.printf("Thanks");
	}
}
