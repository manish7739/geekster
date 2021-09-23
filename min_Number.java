package practice;

public class min_Number {
public static void main(String args[]) {
int arr[]= {3,4,5,21,123,54,76,8,6,4,32,43};	
int min=arr[0];
for(int i=0; i<arr.length; i++) {
	if(arr[i]<min) {
		min=arr[i];
	}
	
}
System.out.println("Minimun number is : "+min);
}
}
