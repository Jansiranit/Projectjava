package task;

import java.util.Iterator;

public class ReverseString {
	public static void main(String[] args) {
		//String name = "Java";
		String name ="Java Selenium";
		
		for(int i=name.length()-1;i>=0;i--) {
			char reverseName = name.charAt(i);
			
			System.out.print(reverseName);
		}
		//System.out.print("");
	}

}
