
public class Fibonacci extends BaseInput {

	public static void main(String[] args) {
		Fibonacci f= new Fibonacci();
		int number=f.IntInput();
		f.output(number);

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
