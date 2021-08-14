package week1.day2;
import java.util.Arrays;
public class MissingElementsInArray {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
		
		// 5 is missing and the numbers are not sorted
		// Step 1: Sort the Array
		// Step 2: for loop
		// if (index != element), then that index is the missing element 
		Arrays.sort(arr);
		System.out.println("Sorted Array ");
		for (int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
			for (int i=arr[0]; i<arr.length; i++) {
				if (arr[i-1] !=i) {
				System.out.println("Missing Element is " + i);
				break;
				}
			}		
	}
}