package LoopStatement;
import java.util.Scanner;

public class Swap {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter First Number");
		int x=s.nextInt();
		System.out.println("Enter Second Number");
		int y=s.nextInt();
		int z;
		z=x;
		x=y;
		y=z;
		System.out.println("Swapping Number " +x+ "  " +y);
/*		
int a=23;
int b=34;
int c;
c=a;
a=b;
b=c;
System.out.println("value of a :" +a );
System.out.println("value of b :" +b); */
}
}