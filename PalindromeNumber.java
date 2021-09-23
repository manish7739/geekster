package Programs;
import java.util.Scanner;

public class PalindromeNumber {
public static void main(String args[]) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number for check palindrome or not :  ");
	int num=sc.nextInt();
	int temp=num,rem,rev=0;
	while(temp!=0) {
		rem=temp%10;
		rev=rev*10+rem;
		temp=temp/10;
		
	}
	if(num==rev) {
		System.out.println("Number is palindrome");
	}
	else {
		System.out.println("Number not is palindrome");
	}
	
}
}
