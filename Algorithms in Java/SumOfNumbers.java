import java.util.Scanner;

public class SumOfNumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many numbers would you like to add? ");
		int n = scanner.nextInt();
		double sum = 0;
		for(int i = 1; i<=n; i++) {
			System.out.print("Enter number #"+i+":");
			double num = scanner.nextDouble();
			sum = sum+num;
		}
		
		System.out.println("Total sum is: "+sum);
	}
}
