public class FlaggedBubbleSort {
	public static void main(String[] args) {
		int[] array = {100,5,2,6,6,2,4,2,7,1};
		bubble_sort(array);
		for(int i = 0; i<array.length; i++) {
			System.out.println(array[i]);
		}
	}

	private static void bubble_sort(int[] array) {
		boolean swapped;
		for(int i = 0; i<array.length-1;i++) {
			swapped = false;
			for(int j = 0;j<array.length-1-i;j++) {
				
				if(array[j] >array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					swapped = true;
				}
			}
			if(!swapped) {
				break;
			}
		}
		
	}
}
