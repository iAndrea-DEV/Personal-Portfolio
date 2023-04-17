import java.util.Scanner;
import java.util.Random;

public class ProbabilisticApproximationOfPI {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random rd = new Random();
		System.out.println("Enter number of trials: ");
		long n = scanner.nextLong();
		long hits = 0;
		
		for (int i = 1; i<=n; i++) {
			double sign1 = rd.nextDouble();
			double sign2 = rd.nextDouble();
			double x = rd.nextDouble();
			double y= rd.nextDouble();
			
			if(sign1<=0.5) {
				x*=-1;
				
			}
			if(sign2<=0.5) {
				y*=-1;
			}
			
			if(distanceToOrigin(x,y) <=1) {
				hits++;
			}
	
		}
		
		double piApprox = 4* hits*1.0/(n*1.0);
		double error = Math.PI-piApprox;
		System.out.println("Approximation of Pi is " + piApprox);
		System.out.println("Error in value of pi is " + error);
		
	}
	
	public static double distanceToOrigin(double x, double y) {
		return Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
	}
}
