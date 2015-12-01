import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		fibonacci f= new fibonacci();
		int number=f.input();
		f.output(number);

	}
	public int input()
	{
		Scanner sc= new Scanner(System.in);
		int number=sc.nextInt();
		sc.close();
		return number;
	}
	public void output(int number)
	{	int m=1;
		int n=1;
		if (number>=1)
		{
			System.out.print(m+","+n);
		}
		while((m+n)<=number)
		{
			System.out.print(","+(m+n));
			m=m+n;
			n=m-n;
						
		}
		
		
	}
}
