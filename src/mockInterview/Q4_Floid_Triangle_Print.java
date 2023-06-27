package mockInterview;

import java.util.Scanner;

public class Q4_Floid_Triangle_Print {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("print the input value to print the no of rows you like to print");
		int num = sc.nextInt();
		sc.close();
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
