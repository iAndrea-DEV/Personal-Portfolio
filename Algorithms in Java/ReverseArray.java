public class ReverseArray {
	public static void main(String[] args) {
		int[] array = {1,4,1,5,3,4,5,8,11,97};
		reverseArray(array);
		for(int i = 0;i<array.length;i++) {
			System.out.println(array[i]);
		}
	}

	private static void reverseArray(int[] array) {
		for(int i =0; i<array.length/2; i++) {
			int temp = array[i];
			array[i] = array[array.length-1-i];
			array[array.length-1-i] = temp;
		}
		
	}
}
