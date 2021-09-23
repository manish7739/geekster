package Programs;
import java.util.Scanner;
public class ReverseString {
public static void main(String args[]) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a String for reverse : ");
	String str=sc.next();
	int length=str.length();
	String rev="";
	for(int i=length-1; i>=0; i--)
        {
		rev=rev+str.charAt(i);
		}
	System.out.println("Reverse string of "+str+" : "+rev);
}
}
