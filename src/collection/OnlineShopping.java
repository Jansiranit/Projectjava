package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class OnlineShopping {
	public static void main(String[] args) {
		ArrayList list = new ArrayList<>();
		list.add("Laptop");
		System.out.println("Laptop added successfully.");
		list.add("Mouse");
		System.out.println("Mouse added successfully.");		
		System.out.println("Products in Cart :" + list);
		Scanner scan = new Scanner(System.in);
		System.out.println("update a product ");
		String checkprod = scan.nextLine();
		if(list.contains(checkprod)) {
			System.out.println("Product already added");
		}else {
			list.add(checkprod);
		}
		System.out.println("Product updated successfully");
		System.out.println("product in cart:" +list );
		System.out.println("Enter update a product");
		list.add (scan.nextLine());
		System.out.println("product in cart: " +list);
		System.out.println("product remove from cart :");
		list.remove("Laptop");
		System.out.println("product removed successfully");
		System.out.println("final cart product :" +list);
	}

}
