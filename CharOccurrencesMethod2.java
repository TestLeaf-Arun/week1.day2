package week1.day2;
public class CharOccurrencesMethod2 {
	public static void main(String[] args) {
		
		// Check number of occurrences of a character in a string
		String str = "welcome to chennai";
		int count=0;
		char[] charArray = str.toCharArray();
		for (int i=0; i<charArray.length; i++) {	
				if (charArray[i] =='e') {
				count++;
				}
		}
		System.out.println("Number of occurrences of character e: " + count);
	}
}