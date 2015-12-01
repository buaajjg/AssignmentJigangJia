import java.util.HashMap;

public class WordPattern {

	public static void main(String[] args) {
		WordPattern wp= new WordPattern();
		String[] pattern= new String[]{"abba","abba","aaaa","aaaa","ab","abcd"}; 
		String []str = new String[]{
			"dog cat cat dog","dog cat cat fish","dog cat cat dog","dog dog dog","fish dog","dog cat pig bird"
			};
		
		for (int i=0;i<6;i++)
		{
			System.out.println("Is pattren '"+pattern[i]+"' match the string '"+str[i]+"' ? --> "
								+wp.wordPattern(pattern[i], str[i]));
			
		}
	}
	
	public boolean wordPattern(String pattern, String str) {
	
	HashMap<Character,String> map= new HashMap<>();
	String [] animal=str.split(" ");
		if (!(pattern.length()==animal.length))
		{
			return false;
		}
		for (int i=0;i<animal.length;i++)
		{
			if (map.containsKey(pattern.charAt(i)))
			{
				if (!(map.get(pattern.charAt(i)).equals(animal[i])))
				{
					return false;
				}
			}
			
			else
			{
				if (map.containsValue(animal[i]))
				{
					return false;
				}
							
			}
			map.put(pattern.charAt(i), animal[i]);
		}
	return true;
	
	}
}
