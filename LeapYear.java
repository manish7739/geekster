package Programs;
import java.util.Scanner;


public class LeapYear {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter year to check leap or not");
		int num=sc.nextInt();
		if(num%4==0) {
			System.out.println("leap year");
		}
		else {
			System.out.println("not leap year");
		}
	}

}
