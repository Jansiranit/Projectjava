package collection;

import java.util.TreeSet;

public class TreesetBook
{
	public static void main(String[] args) {
		TreeSet<Integer> bookIds= new TreeSet<Integer>();
		bookIds.add(101);
		bookIds.add(102);
		bookIds.add(103);
		bookIds.add(104);
		bookIds.add(105);
		
		bookIds.add(103);
		System.out.println(bookIds);
			if(bookIds.contains(105)) {
				System.out.println("Book ID 105 is available");
			}
			else {
				System.out.println("Book ID 105 is Not available");
			}
			bookIds.remove(102);
			System.out.println(bookIds);
	}

}
