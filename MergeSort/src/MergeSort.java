import java.util.Arrays;

public class MergeSort {

	public static void mergeSort(int[] array) {
		
		if (array.length <= 1) {
			return;
		}
		
		int mid = array.length / 2;
		int[] leftArray = new int[mid];
		int[] rightArray = new int[array.length - mid];
		
		
		System.arraycopy(array, 0,  leftArray, 0, leftArray.length);
		System.arraycopy(array, mid, rightArray, 0, rightArray.length);
		
		mergeSort(leftArray);
		mergeSort(rightArray);
		
		merge(array, leftArray, rightArray);
		
	}
	public static void merge(int[] array, int[] leftArray, int[] rightArray) {
		
		int leftIndex = 0;
		int rightIndex = 0;
		int mergedIndex = 0;
	
		while (leftIndex < leftArray.length && rightIndex < rightArray.length) {
			if (leftArray[leftIndex] < rightArray[rightIndex]) {
				array[mergedIndex] = leftArray[leftIndex];
				leftIndex++;
			}
			else {
				array[mergedIndex] = rightArray[rightIndex];
				rightIndex++;
			}
			mergedIndex++;
		}
		
		while (leftIndex < leftArray.length) {
	            array[mergedIndex] = leftArray[leftIndex];
	            mergedIndex++;
	            leftIndex++;
	        }
	        
	        while (rightIndex < rightArray.length) {
	            array[mergedIndex] = rightArray[rightIndex];
	            mergedIndex++;
	            rightIndex++;
	        }
			
	}
	public static void main(String[] args) {
		
		int[] myArr = {12, 11, 13, 5, 6, 7};
		System.out.println("Unsorted: " + Arrays.toString(myArr));
		mergeSort(myArr);
		System.out.println("Unsorted: " + Arrays.toString(myArr));

	}
}
