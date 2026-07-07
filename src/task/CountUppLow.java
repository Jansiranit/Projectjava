package task;

public class CountUppLow {
	public static void main(String[] args) {
		String Input=	"Java123@Test";
		int uppercase=0;
		int lowercase =0;
		int digits = 0;
		int special=0;
		
		for(int i=0; i<Input.length();i++) {
		char ch =	Input.charAt(i);
		if(ch>='A' && ch<='Z') {			
			uppercase++;
		
			
		}else if(ch>='a' && ch<='z') {
			lowercase++;
		}else if(ch>='0' && ch<='9') {
			digits++;
		}else {
			special++;
		}
		
		}
		System.out.println("UPPER CASE COUNT IS ="+uppercase + " LOWER CASE COUNT IS ="+lowercase+" digits count is ="+digits + " special char count is  =" +special);
		
	}
	
	

}
