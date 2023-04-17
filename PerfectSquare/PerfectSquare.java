import java.util.Scanner;
import java.util.ArrayList;

public class PerfectSquare {

//Given a number m, find the smallest number n such that m*n is a perfect square
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> factors = new ArrayList<>();
		ArrayList<Integer> checked = new ArrayList<>();
		System.out.println("Enter an integer m: ");
		int m = scanner.nextInt();
		extractPrime(m, factors);
		int n = 1;
		
		for(int i = 0; i<factors.size(); i++) {
			int occurence = 0;
			for(int j =0; j<factors.size(); j++) {
				if(factors.get(i) == factors.get(j)) {
					occurence ++;
				}
			}
			if(occurence%2 ==1 && !isChecked(checked,factors.get(i))) {
				n*= factors.get(i);
			}
			checked.add(factors.get(i));
		}
		
		System.out.println("The smallest number n for m*n to be a perfect square is " + n);
		System.out.println("m * n is "+ m*n);
		
		scanner.close();
	}
	
	private static boolean isChecked(ArrayList<Integer> checked, int num) {
		boolean isChecked = false;
		if(checked.size() ==0) {
			return isChecked;
		}
		for(int i = 0; i<checked.size(); i++) {
			if(checked.get(i) == num) {
				isChecked = true;
				return isChecked;
			}
		}
		return isChecked;
	}

	public static void extractPrime(int number, ArrayList<Integer> primes) {
		for(int i =2; i<=number; i++) {
			if(number%i==0 && isPrime(i)) {
				primes.add(i);
				extractPrime(number/i, primes);
				return;
			}
		}
	}
	
	public static boolean isPrime(int num) {
		boolean isPrime = true;
		for(int i =2; i<num; i++) {
			if(num % i ==0) {
				isPrime = false;
				return isPrime;
			}
		}
		return isPrime;
	}
}
