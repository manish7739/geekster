package Programs;

import java.util.Scanner;

public class WapTwoNumber {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		int num1=sc.nextInt();
		System.out.println("enter second number");
		int num2=sc.nextInt();
//		int temp;
//		temp=num1;
//		num1=num2;
//		num2=temp;
// Anothe Method without third variable 
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("first number : "+num1);
		System.out.println("Second number : "+num2);
}
}
