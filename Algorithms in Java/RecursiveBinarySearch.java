public class RecursiveBinarySearch {
	public static void main(String[] args) {
		int[] array = {1,1,2,3,4,5,6,8,9,10,11,15,18,47,100};
		int n = 18;
		int index = recursiveBinarySearch(array,n,0,array.length-1);
		System.out.println(index);
	}

	private static int recursiveBinarySearch(int[] array, int n, int low, int high) {
		if(low <=high) {
			int mid = (low+high)/2;
			if(n == array[mid]) {
				return mid;
			}
			else if(n < array[mid]) {
				return recursiveBinarySearch(array,n,low,mid-1);
			}
			else {
				return recursiveBinarySearch(array,n,mid+1,high);
			}
		}
		return -1;
	}
}
