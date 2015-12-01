package countA;

import java.util.*;
public class countA
{
	public static void main(String[] args) 
	{	
		while (true)
		{
		countA A= new countA();
		String st=A.input();
		A.count(st);
		}
				
	}
	public String input()
	{
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
			String st = sc.nextLine();
			return st;
				
	}
	
	public int count(String st)
	{	
		int length= st.length();
		char [] word= st.toCharArray();

		int count=0;
		for (int i=0;i<length ;i++ )
		{	if (word[i]=='a')
			{
			count++;
			}
		}

		if (count>0)
		{
			System.out.println(st+" have "+count+ " 'a' !");
			return count;
		}
		else
			{
			System.out.println(st+" have no 'a' !");
			return 0;
			}

		
	}
	
}
