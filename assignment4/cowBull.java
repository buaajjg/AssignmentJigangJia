import java.util.Random;
import java.util.Scanner;

public class cowBull {

	public static void main(String[] args) {
	Random rand= new Random();
	String key=rand.nextInt(8999)+1000+"";
	cowBull cb= new cowBull();
		for(;;)
		{	String answer=cb.input();
		int [] cowbull=cb.check(key, answer);
		System.out.println(cowbull[0]+"cow "+cowbull[1]+"bull!");
			if (cowbull[1]==4)
			{	System.out.println("YOU WIN!!!");
				break;
			}
		}
	}
	public String input()
	{
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		String number=sc.next();
		return number;
	}
	
	public int[] check(String key, String answer)
	{
		int [] cb={0,0};
		
		for(int i=0;i<4;i++)
		{
			if( key.substring(i, i+1).equals(answer.substring(i,i+1)))
			{
				cb[1]++;
			}
			for(int k=0;k<4;k++)
			{
				if (key.substring(i, i+1).equals(answer.substring(k,k+1)))
				{
					cb[0]++;					
				}
				
			}
		}
		
		cb[0]=cb[0]-cb[1];
		
		return cb;
	}
}
