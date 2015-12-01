
import java.util.*;
public class countA
{
	public static void main(String[] args) 
	{
		while (true)
		{
		
		Scanner sc= new Scanner(System.in);
		String st = sc.next();
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
		}
		else
			{
			System.out.println(st+" have no 'a' !");
			}

		}
	}
}
