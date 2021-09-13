package LoopStatement;
import java.util.Scanner;
public class LargestNumber {
	public static void main(String args[]) {
int number[];
int size, large;
Scanner scn=new Scanner(System.in);
System.out.println("Enter size of array : ");
size=scn.nextInt();
number=new int[size];
System.out.println("enter elements aof array : ");
for(int i=0; i<number.length; i++) {
	number[i]=scn.nextInt();
}
	large=number[0];
	
	for(int i=0; i<number.length;i++) {
		if(large<number[i]) {
			large=number[i];
		}
	}
	System.out.println("largest Value is  : " +large );
	




}
}


