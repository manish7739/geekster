package LoopStatement;
import java.util.Scanner;

public class EvenOdd {
	
public static void main(String args[]) {
	Scanner s1= new Scanner(System.in);
	System.out.println("Enter a Number");
	int a=s1.nextInt();
	if(a%2==0) {
		System.out.println("Even number");
	}
	else {
		System.out.println("Odd number");
	}
	
}
}
