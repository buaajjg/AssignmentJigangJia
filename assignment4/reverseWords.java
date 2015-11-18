import java.util.Scanner;

public class reverseWords {

	public static void main(String[] args) {
	reverseWords rw= new reverseWords();
	String st=rw.input();
	String [] words=rw.split(st);
	String [] result=rw.reverse(words);
	for(String s:result)
	{
		System.out.print(s+" ");
		
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
	
	public String [] reverse(String[] split)
	{  int length=split.length;
		String [] result=new String[length];
		for (int i=0;i<length;i++)
		{
			result[i]=split[length-i-1];
			
		}
		
		return result;
	}
	
}
