public class CountDistinct {
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,7,7,7,7,7}; //There should be 7 distinct elements
		int nDistinct = distinct_elements(array);
		System.out.println(nDistinct);
		
	}

	private static int distinct_elements(int[] array) {
		int count = 1; //Assume start from second element since first one is distinct.
		int[] checked_numbers = new int[array.length];
		checked_numbers[0] = array[0];
		
		for(int i = 1; i<array.length;i++) {
			boolean isDuplicate = false;
			
			for(int j = 0; j<count; j++) {
				if(array[i] == checked_numbers[j]) {
					isDuplicate = true;
					break;
				}
			}
			if(!isDuplicate) {
				checked_numbers[count] = array[i];
				count++;
			}
		}
		return count;
	}
}
