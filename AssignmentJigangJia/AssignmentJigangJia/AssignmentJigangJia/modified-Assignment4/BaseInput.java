import java.util.Scanner;

public class BaseInput {
	
	public String  StringInput()
	{
	Scanner sc= new Scanner(System.in);	
	String input= sc.nextLine();
	sc.close();
	return input;
	}
	
	public int IntInput()
	{
		Scanner sc= new Scanner(System.in);	
		int input= sc.nextInt();
		sc.close();
		return input;
		
	}

}
