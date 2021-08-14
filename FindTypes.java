package week1.day2;
public class FindTypes {
	public static void main(String[] args) {
		String test = "$$ Welcome to 2nd Class of Automation $$";
		int lengthStr = test.length();
		System.out.println("Length of the String: " + lengthStr);
		
		int letter=0, space=0, num=0, specialChar=0;
		char[] charArray = test.toCharArray();
		for (int i=0; i<charArray.length; i++) {
			if (Character.isLetter(charArray[i])) {
				letter=letter+1;
			}
			else if (Character.isDigit(charArray[i])) {
				num=num+1;
			}
			else if (Character.isSpaceChar(charArray[i])) {
				space=space+1;
			}
			else {
				specialChar=specialChar+1;
			}
		}					
			System.out.println("Count of Letters: " + letter);
			System.out.println("Count of Space: " + space);
			System.out.println("Count of Numbers: " + num);
			System.out.println("Count of Special Characters: " + specialChar);
	}
}