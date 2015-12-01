import java.util.*;
public class countX
{
	public static void main(String[] args) 
	{
		while (true)
		{
			countX X= new countX();
			String st=X.input();
			X.count(st);
		
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

		String [] input=st.split(",");
		char [] word= input[0].toCharArray();
		int length= input[0].length();
		
		int count=0;
		for (int i=0;i<length ;i++ )
		{	if (word[i]==input[1].charAt(0))
			{
			count++;
			}
		}

		if (count>0)
		{
			System.out.println(input[0]+" have "+count+ " '"+input[1]+"' !");
			return count;
		}
		else
			{
			System.out.println(input[0]+" have no '"+input[1]+"' !");
			return 0;
			}

		
		
	}

}
