
public class FizzBuzz {

	public static void main(String[] args) {
		FizzBuzz fb= new FizzBuzz();
		fb.printFizzBuzz(5);

	}
	public String printFizzBuzz(int n){
	
	if(n%5==0&&n%3==0){
		System.out.println("fizz buzz");
		return "fizz buzz";
	}
				
	else if (n%3==0){
		System.out.print("fizz");
		return "fizz";
	}
	else if(n%5==0){
		System.out.println("buzz");
		return "buzz";
	}
	return null;
	}
	
}
