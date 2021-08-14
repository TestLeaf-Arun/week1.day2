package week1.day2;
public class ReverseEvenWords {
	public static void main(String[] args) {
		String test = "I am a software tester";
		
		String[] arr1 = test.split(" ");
		for (int i=0; i<arr1.length; i++) {
			if (i%2 == 1) {
				String arr2 = arr1[i];
				System.out.print(" ");
					for (int j=arr2.length()-1; j>=0; j--) {
						System.out.print(arr2.charAt(j));   
					}
			} 
			else {
				System.out.print(" " + arr1[i]);
			}		
		}
	}
}