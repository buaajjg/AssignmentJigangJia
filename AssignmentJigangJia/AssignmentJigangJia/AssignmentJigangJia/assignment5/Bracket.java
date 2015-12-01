import java.util.ArrayDeque;
import java.util.HashMap;

public class Bracket {

	public static void main(String[] args) {
		Bracket bb= new Bracket();
		String []bracket=new String[]{"","}()","(({})[{}]()){}","(({})[{,}]()){}",};
		
		for(String each:bracket)
		{
			try 
			{
				System.out.println("Is '"+each+"' valid? --->" +bb.valid(each));
			}
			catch(Exception e)
			{	//e.printStackTrace();
				System.out.println(e.getMessage());
			}
		}
	}
	
	public boolean valid(String bracket) throws Exception
	{	HashMap<String,String> map= new HashMap<>();
		map.put("(",")");
		map.put("[","]");
		map.put("{","}");
		ArrayDeque <String>deque= new ArrayDeque<>();
		int length=bracket.length();
		
		for (int i=0;i<length;i++)
		{
			String temp=bracket.substring(i, i+1);
			if (temp.equals("(")||temp.equals("[")||temp.equals("{"))
			{
				deque.push(temp);
			}
			else if(temp.equals(")")||temp.equals("]")||temp.equals("}"))
			{	if (deque.size()==0)
				{
					return false;
				}
				else if (!temp.equals(map.get(deque.removeFirst())))
				{	
					return false;
				}
			}
			else
			{
				throw new Exception("String '" +bracket+"' has other element except the bracket!");
			}
		}
		if (length%2!=0||length==0)
		{
			return false;
		}
		if(deque.size()>0)
		{
			return false;
		}
		return true;
	}

}
