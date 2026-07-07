package task;

public class CountVowels {
	public static void main(String[] args) {
	String	Input=	"selenium";
	int vowels=0;
	int consonants=0;
	
	for(int i=0;i<Input.length();i++) {
	char ch = Input.charAt(i);
	if(ch=='a' || ch=='e' || ch=='i' || ch=='o'|| ch=='u') {
		vowels++;
		
	}
	else if (ch>='a' && ch<='z') {
		consonants++;
		
	}
	
	
	}
	System.out.println("Vowels  :"+ vowels  +"  Consonants  :"+  consonants);
	}
}
