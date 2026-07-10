package org.automation.autotesting;

import java.util.Iterator;
import java.util.Scanner;

public class ThreeArray {

	public static void main(String[] args) {
		// 1.Create a 3d array of size 2x2x2
//		2.Assign values manually display all values.
//		3.Store values using scanner class.
//		4.Display all elemnts using nested loops
		int[][][] a = new int[2][2][2];
		a[0][0][0] = 100;
		a[0][0][1] = 200;
		a[0][1][0] = 300;
		a[0][1][1] = 400;

		a[1][0][0] = 500;
		a[1][0][1] = 600;
		a[1][1][0] = 700;
		a[1][1][1] = 800;

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				for (int k = 0; k < a[i][j].length; k++) {
					System.out.print(a[i][j][k] + " ");

				}
			}
			System.out.println();

		}
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter row size    :");
		int row =scan.nextInt();
		System.out.println("enter coloum size :");
		int culum=scan.nextInt();
		System.out.println("Enter index size   :");
		int index =scan.nextInt();
		
		int[][][]b= new int[row][culum][index];
		System.out.println("Enter "+(row * culum * index) +" integer values");

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < culum; j++) {
				for (int k = 0; k < index; k++) {
				b[i][j][k] =scan.nextInt();

				}
			}
			
		}
		System.out.println("Display user input values");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < culum; j++) {
				for (int k = 0; k <b[i][j].length; k++) {
				System.out.print(b[i][j][k]+  " ");
				}
			}
			System.out.println();
		}
	}
}
