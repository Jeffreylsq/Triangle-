package w;
import java.util.Scanner;
public class IsoscelesTriangle {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter level of triangle you want to print");
		int level = kb.nextInt();
		printTriangle(level);
	}
	
	
	
	
	
	public static void printTriangle(int level){
		int num = 1;
		
		while(num <= level)
		{
			for(int i = num ; i < level; i++)
			{
				System.out.print(" ");
			}
			
			int amount = num * 2 - 1;
			
			while(amount > 0)
			{
				System.out.print("*");
				amount --;
			}
			System.out.println();
			num++;
		}
		
	}

}
