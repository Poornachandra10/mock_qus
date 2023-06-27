package mockInterview;

import java.util.Scanner;

public class Q3_PronicNumbers_Num_check {

	public static void main(String[] args) {

		// What is a pronic number example?
		// Java - Check if a number is a Pronic or Heteromecic or not
        //A pronic number is a number which is the product of two consecutive integers, that is, 
		// a number of the form n(n + 1). The first few pronic numbers are: 0, 2, 6, 12,
		// 20, 30, 42, 56, 72,
		// 90, 110, 132, 156, 182, 210, 240, 272, 306, 342, 380, 420,

		Scanner sc = new Scanner(System.in);
		int num, res = 1;
		System.out.println("Enter the number : ");
		num = sc.nextInt();
		sc.close();
		for (int i = 0; i < num; i++) {
			if (i * (i + 1) == num) {
				res = 1;
				break;
			}
			res = 0;
		}
		if (res == 1) {
			System.out.println("It's pronic");
		} else {
			System.out.println("Its not Pronic");
		}

	}

}
