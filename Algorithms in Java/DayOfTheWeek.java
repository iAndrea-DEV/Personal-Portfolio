import java.util.Scanner;

public class DayOfTheWeek {

	public static void main(String[] args) {
		
		String[] days = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter year: ");
		int y = scanner.nextInt();
		System.out.println("Enter month 1-12: ");
		int m = scanner.nextInt();
		System.out.println("Enter day of month 1-31: ");
		int dm = scanner.nextInt();
		
		switch(m) {
		case 1:
		case 2:
			m +=12;
			y--;
			break;
		}
		
		int d = (dm + (26*(m+1))/10 + 5*(y%100)/4 + 21*(y/100)/4)%7;
		
		System.out.println("Day of the week is " + days[d]);
		scanner.close();
			
	}
}
