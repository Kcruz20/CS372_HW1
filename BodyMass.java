import java.util.Scanner;
public class BodyMass{
	public static void main (String [] args){
		System.out.println ( "Please enter you weight (in pounds) and your height (in inches)");
		Scanner input = new Scanner(System.in);
		int uWeight = input.nextInt();
		int uHeight = input.nextInt();
		double Weight = uWeight * 0.4536;
		double Height = uHeight * 0.0254;
		double BMI = Weight * Height * Height;
		System.out.println("Your BMI is " + BMI + " in kg/m2");
		}
	}