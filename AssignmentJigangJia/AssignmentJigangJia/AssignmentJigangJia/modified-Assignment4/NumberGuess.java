import java.util.Random;
import java.util.Scanner;

public class NumberGuess {

	public static void main(String[] args) 
	throws Exception
	{
		NumberGuess ng= new NumberGuess();
		System.out.println("Please guess a number between 1 and 100");
		Random rand= new Random();
		int number=rand.nextInt(100);
		
		
		for (int i=0;i<=4;i++)
		{	System.out.println("You have "+(5-i) +" chances to guess");
			int temp=ng.guess();
			
			if (i==4)
			{
				System.out.println("Game Over, You Lose!!!");
				break;
			}
			
			if (temp==number)
			{
			System.out.println("Congratulations! You've guessed it right and you guessed it in "+(i+1)+" chances.");
			break;
			}
			if (temp<number)
			{
				System.out.println(temp+" is less than what I've guessed - ");
				continue;
			}
			if (temp>number)
			{	System.out.println(temp+" is greater than what I've guessed - ");
				continue;
			}
			
		}

	}
	@SuppressWarnings("resource")
	public int guess()
			throws Exception
	{	
		Scanner sc= new Scanner(System.in);
		int number=sc.nextInt();
		return number;
	
	}
	
}
