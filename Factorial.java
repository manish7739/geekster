package Programs;
import java.util.Scanner;
public class Factorial {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number you want to print factorial number : ");
	int num=sc.nextInt();
	int fact=1;
	for(int i=num; i>=1; i--)//for(int i=1; i<=num;i++)
	{
		fact=fact*i;
	}
	System.out.println("fatorial number of " +num+ " is = " +fact);
}
}
