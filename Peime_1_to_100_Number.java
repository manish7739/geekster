package Programs;

import java.util.Scanner;

public class Peime_1_to_100_Number {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number : ");
		int a=sc.nextInt();
		System.out.println("Enter second number : ");
		int b=sc.nextInt();
		int i,j;
		for( i=a; i<=b; i++) 
		{
			
			for(j=2; j<=i-1; j++) {
				if(i%j==0) {
					break;
				}
			}
			if(i==j) {
				System.out.println(j);	
			}
			
		}
		

}
}
