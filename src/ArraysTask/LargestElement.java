package ArraysTask;

public class LargestElement {

	public static void main(String[] args) {
		int[] input= { 10 ,25, 8, 45, 18};
		for(int i=0; i<input.length;i++) {
			int max=input[0];
			if(input[i]>max ) {
				max=input[i];
			}
		}
	}
	
}
