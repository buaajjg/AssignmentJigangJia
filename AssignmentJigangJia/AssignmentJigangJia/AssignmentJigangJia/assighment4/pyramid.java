import java.util.Scanner;

public class pyramid {

	public static void main(String[] args) {
		pyramid p=new pyramid();
		int number=p.input();
		p.drawPyramid(number);

	}

	public int input()
	{
		Scanner sc= new Scanner(System.in);
		int number=sc.nextInt();
		sc.close();
		return number;
	}
	
	public void drawPyramid(int number)
	{	int count=1;
		for (int i=1;i<=number;i++)
		{
			for (int k=0;k<number-i;k++)
			{
				System.out.print(" ");
			}
			for (int h=1;h<=i;h++)
			{
				System.out.print(count+++" ");
			}
			System.out.println();
		}
		
		
	}
}
