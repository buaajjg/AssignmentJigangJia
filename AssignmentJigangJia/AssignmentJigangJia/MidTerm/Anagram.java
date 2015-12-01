import java.util.Arrays;

public class Anagram {
	public static void main(String [] args){
		
		Anagram ana= new Anagram();
		System.out.println(ana.isAnagram("cargtr", "arctgr"));
	}
	
	
	public boolean isAnagram(String s,String t){
		int sLength=s.length();
		int tLength=t.length();
		if(sLength!=tLength){
			return false;
		}
		char [] sArray= new char[sLength];
		char [] tArray= new char[tLength];
		
		for (int i=0;i<sLength;i++){
			sArray[i]=s.charAt(i);
			tArray[i]=t.charAt(i);
			
		}
		
		Arrays.sort(sArray);
		Arrays.sort(tArray);
		
		for (int i=0;i<sLength;i++){
			if (sArray[i]!=tArray[i]){
				return false;
			}
						
		}
		
		return true;
	}
}
