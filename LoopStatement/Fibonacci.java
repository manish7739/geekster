package LoopStatement;

public class Fibonacci {
	
public static void main(String args[]) {
	int a=2, b=3;
	for(int i=1; i<12; i++) {
		int c=a+b;
		System.out.println(c);
		a=b;
		b=c;
	}
}
}
