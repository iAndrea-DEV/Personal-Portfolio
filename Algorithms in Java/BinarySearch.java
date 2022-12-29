public class BinarySearch {

	public static void main(String[] args) {
		int[] array = {1,1,2,3,4,5,6,8,9,10,11,15,18,47,100};
		int n = 18;
		int index = binarySearch(array,n);
		System.out.println(index);
	}

	private static int binarySearch(int[] array, int n) {
		int min = 0;
		int max = array.length;
		while(min<=max) {
			int mid = (min+max)/2;
			if(n == array[mid]) {
				return mid;
			}
			else if(n <array[mid]) {
				max = mid;
			}
			else {
				min = mid;
			}
		}
		return -1;
	}
}
