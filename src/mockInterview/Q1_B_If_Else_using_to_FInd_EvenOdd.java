package mockInterview;

import java.util.Scanner;

public class Q1_B_If_Else_using_to_FInd_EvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Number");
		int num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println("It is even number");
		} else {
			System.out.println("Its odd number");
		}
		sc.close();
	}

}
