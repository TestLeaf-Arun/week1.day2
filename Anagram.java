package week1.day2;
import java.util.Arrays;
public class Anagram {
	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "potss";
	
		if (text1.length() == text2.length()) {
			System.out.println("Length of the strings are same");
		}
		else {
			System.out.println("Length of the strings are not same");
		}
		
		char[] charArray1 = text1.toCharArray();
		char[] charArray2 = text2.toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		System.out.println(charArray1);
		System.out.println(charArray2);
		
		boolean result=Arrays.equals(charArray1,charArray2);
		if (result==true) {
			System.out.println("Yes, both the Strings are Anagram");
		}
		else
			System.out.println("No, both the Strings are not Anagram");
		}
	}