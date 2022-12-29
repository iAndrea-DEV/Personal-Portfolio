import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = scanner.nextInt();
		factorial(num);
	}

	private static void factorial(int num) {
		int n = num;
		long factorial = 1;
		if(n>0) {
			while(n!=1) {
				factorial *=n;
				n--;
			}
		}
		else if(n<0) {
			System.out.println("Cannot calculate negative factorials.");
			return;
		}
		
		System.out.println(num+"!"+ " is " +factorial);
		
	}
}
