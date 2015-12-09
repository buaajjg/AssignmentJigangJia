
public class ReverseWords extends BaseInput implements SplitToArray{

	public static void main(String[] args) {
	ReverseWords rw= new ReverseWords();
	String st=rw.StringInput();
	String [] words=rw.splitToArray(st," ");
	
	String [] result=rw.reverse(words);
		for(String s:result)
		{
			System.out.print(s+" ");
			
		}
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
