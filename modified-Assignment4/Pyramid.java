public class Pyramid extends BaseInput{

	public static void main(String[] args) {
		Pyramid p=new Pyramid();
		int number=p.IntInput();
		p.drawPyramid(number);

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
