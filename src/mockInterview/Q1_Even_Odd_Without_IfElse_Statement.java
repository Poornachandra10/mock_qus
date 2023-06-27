package mockInterview;

import java.util.Scanner;

public class Q1_Even_Odd_Without_IfElse_Statement {

	public static void main(String[] args) {
		String arr[]= {"Even","Odd"};
		Scanner sc=new Scanner (System.in);
	
	System.out.println("Enter the Number");
	int num=sc.nextInt();
	System.out.println(arr[num%2]);
	sc.close();
	}
	

}
