package week1.day2;
import java.util.Arrays;
public class FindSecondLargestInArray {
	public static void main(String[] args) {
		// Initialize the Array
		int[] data = {3,2,11,4,6,7};
				
		// Step 1: Sort the Array
		Arrays.sort(data);
				
		// Step 2: Print the Second Largest element of the Array
		System.out.println("Second Largest element in the Array is " + data[data.length-2]);
	}
}
