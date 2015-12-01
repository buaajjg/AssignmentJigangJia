
public class CapitalizeInitial extends BaseInput implements SplitToArray{

	public static void main(String[] args) {
		CapitalizeInitial ci= new CapitalizeInitial();
		String st=ci.StringInput();
		String [] words=ci.splitToArray(st," ");
		String [] initial=ci.initial(words);
		for (String capital: initial)
		{
			System.out.print(capital+" ");
			
		}
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
