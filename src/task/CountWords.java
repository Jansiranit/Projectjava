package task;

public class CountWords {
	public static void main(String[] args) {
		String Input="Java is easy to learn";
		
		String[] words=Input.split(" ");
		int countswords = words.length;
		System.out.println("Total Words ="+countswords);
			
	}

}
