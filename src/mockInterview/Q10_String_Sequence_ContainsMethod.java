package mockInterview;

import java.util.Scanner;

public class Q10_String_Sequence_ContainsMethod {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter any string :");
		String str = sc.nextLine();

		System.out.println("enter the str value to find string sequence is avilable or not: ");
		String str1 = sc.nextLine();

		System.out.println(str.contains(str1));
		
sc.close();
	}
}
