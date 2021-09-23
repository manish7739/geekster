package Programs;
import java.util.Scanner;
public class EvenOdd {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num1=sc.nextInt();
		if(num1%2==0) {
			System.out.println("Even number");
		}
		else {
			System.out.println("odd number");
		}
}
}
