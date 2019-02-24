package w;

import java.util.Scanner;

public class RightTriangle2 {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter level of right triangle ");
		int level = kb.nextInt();
		printRightTriangle(level);

	}

	public static void printRightTriangle(int level) {

		for (int num = level; num > 0; num--) {
			for (int i = num; i > 0; i--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
