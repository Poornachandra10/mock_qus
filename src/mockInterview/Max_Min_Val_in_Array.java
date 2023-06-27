package mockInterview;

import java.util.Arrays;
import java.util.Scanner;

public class Max_Min_Val_in_Array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array length");
		int len=sc.nextInt();
		int[] arr=new int[len];
		int lastele=len-1;
		for(int i=0; i<=len-1; i++) {
			System.out.println("enter any num");
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
	System.out.println("Lowest val of this array is: "+arr[0]);
		System.out.println("Highest val of this array is: "+arr[lastele]);
		
		
		
		
//		int [] arr= {10,20,43,64,90};
//		int i=arr.length-1;
//		Arrays.sort(arr);
//		System.out.println("Lowest val of this array is: "+arr[0]);
//		System.out.println("Highest val of this array is: "+arr[i]);
	}

}
