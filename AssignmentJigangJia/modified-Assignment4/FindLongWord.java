
public class FindLongWord extends BaseInput implements SplitToArray{

	public static void main(String[] args) {
		FindLongWord flw= new FindLongWord();
		String st=flw.StringInput();
		String [] words=flw.splitToArray(st," ");
		flw.filter(words);


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
