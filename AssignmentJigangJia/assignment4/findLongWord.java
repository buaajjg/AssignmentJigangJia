import java.util.Scanner;

public class findLongWord {

	public static void main(String[] args) {
		findLongWord flw= new findLongWord();
		String st=flw.input();
		String [] words=flw.split(st);
		flw.filter(words);


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
		{	if (st.substring(i,i+1).equals(" ") )
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
		//this is added to filter the "," and "." in the array,not same as the code before
		else if (st.substring(i,i+1).equals(",")||st.substring(i,i+1).equals("."))
			{
						
			}
		else{	
			temp=temp+st.substring(i,i+1);
			}
		}
		words[count]=temp;		
		return words;
	}
	public String [] filter(String [] words)
	{
		
		int count=0;
		for(String filter: words)
		{	if (filter.length()>3)
			{
				System.out.println(filter);
				count++;
			}
			
		}
		String [] filtered= new String[count];
		count=0;
		for(String filter: words)
		{	if (filter.length()>3)
			{
			filtered[count]=filter;
			count++;
			}
			
		}
		return filtered;
		
	}
	
}
