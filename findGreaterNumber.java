package Programs;
import java.util.Scanner;
public class findGreaterNumber {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		int num1=sc.nextInt();
		System.out.println("enter second number");
		int num2=sc.nextInt();
		System.out.println("enter third number");
		int num3=sc.nextInt();
		if(num1>num2 && num1>num3) {
			System.out.println("first number is greater ");
			
		}
		else if(num2>num1 && num2>num3) {
			System.out.println("second number is greater ");
		}
		else {
			System.out.println("Third number is greater ");
		}
//         if(num1>num2) 
//         {
//        	 System.out.println("first number is greater ");
//         }
//         else {
//        	 System.out.println("Second number is greater");
//         }
		
	    }
	 }
