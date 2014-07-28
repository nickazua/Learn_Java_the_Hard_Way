import java.util.Scanner;

public class RudeQuestions
{
	public static void main( String[] args )
	{
		String name;
		int age;
		double weight, income;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print( "Hello. What is your name? ");
		name = keyboard.next();
		
		System.out.print( "Hi, " + name + "! How old are you? " );
		age = keyboard.nextInt();
		
		System.out.println( "So you're " + age + ", eh? That's not that old at all." );
		System.out.print( "how much do you weigh, " + name + "? " );
		weight = keyboard.nextDouble();
		
		System.out.print( weight + "! Better keep that quiet. Finally, what's your income, " + name + "? ");
		income = keyboard.nextDouble();
		
		System.out.println( "Hopefully that is " + income + " per hour and not per year!" );
		System.out.println( "Well, thanks for answering my rude questions, " + name + "." );
	}
}