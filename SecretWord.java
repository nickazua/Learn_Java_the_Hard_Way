import java.util.Scanner;

public class SecretWord
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		String secret = "please", guess;
		
		System.out.print( "What's the secret word? " );
		guess = keyboard.next();
		
		if ( guess == secret )
		{
			System.out.println( "Impossible. (This will never be printed.)" );
		}
		
		if ( guess.equals(secret) )
		{
			System.out.println( "That's correct!" );
		}
		else
		{
			System.out.println( "Nope, the secret word is not \"" + guess + "\"." );
		}
	}
}