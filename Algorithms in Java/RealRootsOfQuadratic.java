import java.util.Scanner;

public class RealRootsOfQuadratic {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("The general equation of a parabola is a*x^2 + b*x + c = 0.");
		System.out.println("a, b and c are coeffiecients before the powers of x.");
		System.out.println("Enter the value of a, b and c separated by one space each, for example 1 -1 -1: ");
		float a = scanner.nextFloat();
		float b = scanner.nextFloat();
		float c = scanner.nextFloat();
		findRoots(a,b,c);
	}

	private static void findRoots(float a, float b, float c) {
		// x1,x2 = (-b +- sqrt(b^2-4ac))/2a
		float D = b*b-4*a*c;
		float x1 = (float) ((-1*b-Math.sqrt(D))/(2*a));
		if(D<0) {
			System.out.println("Quadratic has complex roots.");
		}
		else if(D==0) {
			System.out.println("Quadratic has a repeated root x= "+x1);
		}
		else {
			float x2 = (float) ((-1*b+Math.sqrt(D))/(2*a));
			System.out.println("x1 = "+x1);
			System.out.println("x2 = "+x2);
		}
		
	}

}
