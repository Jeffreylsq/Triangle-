package w;
import java.util.Scanner;
public class RightTriangle1 {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter level of right triangle");
		int num = kb.nextInt();
		printRightTriangle(num);

	}
	
	// print out right triangle

	public static void printRightTriangle(int level)
	{
		
		
		for(int num = 0 ; num < level ; num ++)
		{
			for(int i = 0; i <= num ; i++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
