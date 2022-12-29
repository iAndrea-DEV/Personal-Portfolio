public class LargestNumberInArray {
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,1,55,2,12,3};
		int n = largest_number(arr);
		System.out.println(n);
	}
	public static int largest_number(int[] array) {
		int largest = array[0];
		for(int i =1; i<array.length; i++) {
			if(array[i] > largest) {
				largest = array[i];
			}
		}
		return largest;
	}
}
