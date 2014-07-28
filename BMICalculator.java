import java.util.Scanner;

public class BMICalculator
{
	public static void main( String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		double m, kg, bmi, inch_h, lbs_w;
		
		// modified for Study Drill to ask for empirical measurements
		System.out.print( "Your height (feet only): " );
		inch_h = keyboard.nextInt() * 12;
		System.out.print( "Your height (inches): ");
		inch_h = keyboard.nextInt() + inch_h;
		
		System.out.print( "Your weight in pounds: " );
		lbs_w = keyboard.nextDouble();
		
		// metric conversions to change inches to meter
		m = inch_h / 39.370;
		// metric conversion from pounds to kilogram
		kg = lbs_w / 2.2046;
		
		bmi = kg / (m*m);
		
		System.out.println ( "Your BMI is " + bmi );
	}
}