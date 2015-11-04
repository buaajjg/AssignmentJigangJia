import java.util.Scanner;

public class capitalizeInitial {

	public static void main(String[] args) {
		capitalizeInitial ci= new capitalizeInitial();
		String st=ci.input();
		String [] words=ci.split(st);
		String [] initial=ci.initial(words);
		for (String capital: initial)
		{
			System.out.print(capital+" ");
			
		}
	}
	public String input()
	{
		Scanner sc= new Scanner(System.in);
		String st=sc.nextLine();
		sc.close();
		return st;
	}
	public String [] split(String st)
	{	int length=st.length();
		
		int count=0;
		String temp="";
		for (int i=0;i<length;i++ )
		{	if (st.substring(i,i+1).equals(" "))
			{	
				count++;	
			}
		
		}
		String [] words= new String[count+1];
		count=0;
		for (int i=0;i<length;i++ )
		{	if (st.substring(i,i+1).equals(" "))
			{	
				words[count]=temp;
				temp="";
				count++;
			}
		else{	
			temp=temp+st.substring(i,i+1);
			}
		}
		words[count]=temp;		
		return words;
	}
	
	public String [] initial(String [] words)
	{	int length=words.length;
		String [] capital= new String[length];
		for (int i=0;i<length;i++)
		{
			String init=words[i].substring(0, 1).toUpperCase();
			capital[i]=init+words[i].substring(1);
			
		}
		
		return capital;
	}
}
