import java.util.Scanner;

public class ComplexRootsOfQuadratic {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("The general equation of a parabola is a*x^2 + b*x + c = 0.");
		System.out.println("a, b and c are coeffiecients before the powers of x.");
		System.out.println("Enter the value of a, b and c separated by one space each, for example 1 -1 -1: ");
		float a = scanner.nextFloat();
		float b = scanner.nextFloat();
		float c = scanner.nextFloat();
		findRoots(a,b,c);
		scanner.close();
	}
	
	public static void findRoots(float a, float b, float c) {

		float D = b*b - 4*a*c;
		double x1,x2;
		boolean imaginaryRoots = false;
		boolean repeated = false;
		
		if(D<0) {
			D = -1* D;
			imaginaryRoots = true;
		}
		else if(D==0) {
			repeated = true;
		}
		
		if(imaginaryRoots == true) {
			System.out.println("The first complex root of the equation is x = "+ -1*b/(2*a) + " + " + Math.sqrt(D)/(2*a) + "i" );
			System.out.println("The second complex root of the equation is x = "+ -1*b/(2*a) + " - " + Math.sqrt(D)/(2*a) + "i" );
		}
		else if(repeated == true) {
			x1 = (-1*b - Math.sqrt(D))/(2*a);
			System.out.println("The only repeated roof of the equation is x = " + x1);
		}
		else {
			x1 = (-1*b - Math.sqrt(D))/(2*a);
			x2 = (-1*b + Math.sqrt(D))/(2*a);
			System.out.println("The two roots of the equation are x = " + x1 + " and x = " + x2);
		}
	}
}
