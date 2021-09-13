package LoopStatement;
import java.util.Scanner;

public class Sum100Number {
	public static void main(String args[]) {
		int t=010;
		int w=07;
		System.out.println("Enter the Number as You want to sum of digits : " +w);
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the Number as You want to sum of digits : ");
		int y=s.nextInt();
		int sum=0;
		int i=1;
				while(i<=y) {
					sum=sum + i;
					i++;
					
				}
		System.out.println("Sum of First 100  Natural Numbers is = " +sum);
		int t=010;
		int w=07;
		System.out.println("Enter the Number as You want to sum of digits : " +w);
		
		
	}

}
