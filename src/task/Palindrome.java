package task;

public class Palindrome {
	public static void main(String[] args) {
		String input= "madam";
		String reverseOutput ="";
		for(int i=input.length()-1;i>=0;i--) {
			reverseOutput += input.charAt(i);
			//System.out.println(reverseOutput);
					}
		if (input.equals(reverseOutput)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not palindrome");
		}
	}

}
