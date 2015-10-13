import java.util.Random;
import java.util.Scanner;

public class CowBull  {

	public static void main(String[] args) {
	Random rand= new Random();
	String key=rand.nextInt(8999)+1000+"";
	CowBull cb= new CowBull();
	
		for(;;)
		{	String answer=cb.input();
		CowAndBull cab= cb.FindCowAndBull(key, answer);
		
		System.out.println(cab);
			if (cab.bull==4)
			{	System.out.println("YOU WIN!!!");
				break;
			}
		}
	}
	public String input()
	{
		Scanner sc= new Scanner(System.in);
		String st= sc.nextLine();
		return st;

	}
	
	
	public CowAndBull FindCowAndBull(String key, String answer)
	{
		CowAndBull cab= new CowAndBull();
		int cow=0;
		int bull=0;
		
		for(int i=0;i<4;i++)
		{
			if( key.substring(i, i+1).equals(answer.substring(i,i+1)))
			{
				bull++;
			}
			for(int k=0;k<4;k++)
			{
				if (key.substring(i, i+1).equals(answer.substring(k,k+1)))
				{
					cow++;					
				}
				
			}
		}
		
		cow=cow-bull;
		
		cab.cow=cow;
		cab.bull=bull;
		return cab;
	}
	
	public  class CowAndBull
	{
		int cow;
		int bull;
		
		public String toString()
		{
			return (cow+"cow "+bull+"bull");
			
		}
		
	}
}
