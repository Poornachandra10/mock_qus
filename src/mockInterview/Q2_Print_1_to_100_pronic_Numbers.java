package mockInterview;

import java.util.Scanner;

public class Q2_Print_1_to_100_pronic_Numbers {

	public static void main(String[] args) {
//		Pronic number can be defined as a number when it is a product of two consecutive integers. Mathematically, 
//		the Pronic number is in the form of n(n+1).
//		It is also called as heteromecic number, oblong number or rectangular number
//		The first few pronic numbers are: 0, 2, 6, 12, 20, 30, 42, 56, 72, 90, 110, 132, 156, 182
//		, 210, 240, 272, 306, 342, 380, 420, 462 …
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		System.out.println("Pronic numbers from 1 to " + n);
		sc.close();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i - 1; j++) {
				if (j * (j + 1) == i) {
					System.out.println(i + " ");
					break;
				}
			}
		}

	}

}
