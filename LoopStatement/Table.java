package LoopStatement;
import java.util.Scanner;

public class Table {
public static void main(String args[]) {
			Scanner s =new Scanner(System.in);
			System.out.println("Enter the number you want to print table");
			int x= s.nextInt();
			
			for(int i=1; i<=10; i++) {
				int z=x*i;
				System.out.println(x+ " * " + i + "=" +z);
			}
		}

	}


