package practice;

public class maxNumber {
public static void main(String args[]) {
	int[] arr= {45,23,65,88,8,32,67,32,76,32};
	int max=arr[0];
	
	for(int i=1;i<arr.length; i++) {
		if(arr[i]>max) {
			max=arr[i];
			
		}
	}System.out.println(max);
}
}
