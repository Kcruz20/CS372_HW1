import java.util.Scanner;
public class StringToInteger {
	public static void main(String[] args) {
		System.out.println ("Please enter a number");
		Scanner input = new Scanner(System.in);
		String uNum = input.next();
		int Num = uNum.charAt(0);
		
		//The assignment is to convert "1234" to 1234, not check that the first character is a digit. -8
		if(Num > 57)
			System.out.println ("Please enter a number");
		else if (Num < 48)
			System.out.println("please enter a number");
		else 
			System.out.printf("Thanks");
	}
}
