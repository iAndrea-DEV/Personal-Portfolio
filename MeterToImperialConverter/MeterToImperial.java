import java.util.Scanner;

public class MeterToImperial {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		//1 yard = 3 feet.
		//1 foot = 12 inches.
		//1 chain = 22 yards
		//1 furlong = 10 chains
		
		int nYard = 0;
		int nFeet = 0;
		int nInches = 0;
		int nChain = 0;
		int nFurlong = 0;
		
		System.out.println("Enter number of metres: ");
		int metres = scanner.nextInt();
		nInches = (int) (metres * 39.3701);
		
		nFeet = nInches/12;
		nInches -= nFeet*12;
		nYard = nFeet/3;
		nFeet -= nYard*3;
		nChain = nYard/22;
		nYard -= nChain*22;
		nFurlong = nChain/10;
		nChain -= nFurlong*10;

		
		String yard = "";
		String foot = "";
		String inch = "";
		String chain= "";
		String furlong = "";
		
		if(nYard == 1) {yard = "Yard";}
		else {yard = "Yards";}
		
		if(nFeet == 1) {foot = "Foot";}
		else {foot = "Feet";}
		
		if(nInches == 1) {inch = "Inch";}
		else {inch = "Inches";}
		
		if(nChain == 1) {chain = "Chain";}
		else {chain = "Chains";}
		
		if(nFurlong == 1) {furlong = "Furlong";}
		else {furlong = "Furlongs";}
		
		System.out.println(metres + " metre in yards, feet and inches is:");
		
		int[] conversion = {nChain, nFurlong, nYard, nFeet, nInches};
		String[] stringConversion = {chain, furlong, yard, foot, inch};
		int nOutputs = 0;
		for(int i =0; i<5; i++) {
			if(conversion[i] != 0) {
				if(i==4 && conversion[i] != 0) {
					System.out.print(" and ");
				}
				if(i < 4 && i > 0 && conversion[i] != 0 && nOutputs !=0) {
					System.out.print(", ");
				}
				if(i !=0) {
					System.out.print(conversion[i] + " " +stringConversion[i]);
					nOutputs++;
					
				}
				else {
					System.out.print(conversion[i] + " " +stringConversion[i]);
					nOutputs++;
					
				}
				
				
			}
		}

		scanner.close();
	}
}
