public class LinearSearch {
	public static void main(String[] args) {
		int n = 5;
		int[] array = {3,4,6,7,7,8,9,5,2,3,4,5}; //Should return 7 as it is the index of the first occurrence 
		int index = linear_search(array,n);
		System.out.println(index);
	}

	private static int linear_search(int[] array, int n) {
		for(int i = 0;i<array.length;i++) {
			if(array[i] == n) {
				return i;
			}
		}
		return -1;
		
	}
}
