package Programs;
import java.util.Scanner;

public class AddTwoNumber {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		int num1=sc.nextInt();
		System.out.println("enter second number");
		int num2=sc.nextInt();
		
		System.out.println("sum of two number : "+(num1+num2));
	}

}
