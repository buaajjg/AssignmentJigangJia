
public interface SplitToArray 
{
	
	default public String [] splitToArray(String st,String key )
	{
		int length=st.length();
		int count=0;
		String temp="";
		for (int i=0;i<length;i++ )
		{	if (st.substring(i,i+1).equals(key))
			{	
				count++;	
			}
		
		}
		String [] words= new String[count+1];
		count=0;
		for (int i=0;i<length;i++ )
		{	if (st.substring(i,i+1).equals(key))
			{	
				words[count]=temp;
				temp="";
				count++;
			}
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

}
