package task;

public class NonRepeatedCharacter {
	public static void main(String[] args) {
		String Input="swiss";
		for(int i=0;i<Input.length();i++) {
			char ch =Input.charAt(i);
			if(Input.indexOf(ch)==Input.lastIndexOf(ch)) {
				System.out.println("output :" +ch);
				return;
			}
		}
		
		System.out.println("no unique character found");
			
	}
	

}
