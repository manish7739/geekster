package practice;

public class febonacci {
public static void main(String args[]) {
	int a=0, b=1;
	int num=10;
	int sum;
	for(int i=2; i<=num; i++) {
		sum=a+b;
		System.out.println(sum);
		a=b;
		b=sum;
	}
}
}
