package week1.day2;
public class CharOccurence {
	public static void main(String[] args) {
		
		// Check number of occurrences of a character in a string
		String str = "welcome to chennai";
		int orgLen = str.length();
		String newStr = str.replace("e", "");
		int newLen = newStr.length();
		System.out.println(orgLen);
		System.out.println(newLen);
		int c = orgLen-newLen;
		System.out.println("Number of occurrences of character e in the string is " + c);
	}
}