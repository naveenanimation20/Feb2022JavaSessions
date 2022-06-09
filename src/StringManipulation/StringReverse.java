package StringManipulation;

public class StringReverse {

	public static void main(String[] args) {

		System.out.println(reverseString("selenium"));// muineles
		System.out.println(reverseString("m"));// muineles
		System.out.println(reverseString("101"));// muineles
		System.out.println(reverseString(null));
		System.out.println(reverseString("1"));
		System.out.println(reverseString("nvn"));
		
		System.out.println(isPallindromString("madam"));
		System.out.println(isPallindromString("pop"));
		System.out.println(isPallindromString("malayalam"));
		System.out.println(isPallindromString("101"));

		
		//

	}
	
	public static boolean isPallindromString(String str) {
		if(str.equals(reverseString(str))){
			return true;
		}
		else {
			return false;
		}
	}

	public static String reverseString(String str) {
		
		if(str == null) {
			System.out.println("not a valid string ..null");
			return null;
		}

		int len = str.length();
		if (len == 1) {
			return str;
		}

		String rev = "";
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);// m
		}

		return rev;

	}

}
