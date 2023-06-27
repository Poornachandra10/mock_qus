package mockInterview;

import java.util.Scanner;

public class Q8_Disarium_or_not_given_Number {
// 1, 2, 3, 4, 5, 6, 7, 8, 9, 89, 135, 175
	//method to check wheather a number is disarium or not 
	static boolean check(int n) {
		// count digits in n
	int count_digits=Integer.toString(n).length();
	
	//compute sum of terms like digit multiplied by
	// power of posotion
	
	int sum =0;  //Intialize sum of terms
	int x=n;
	while(x!=0) {
		//Get the right most digit 
		int r=x%10;
		sum =(int)(sum+Math.pow(r, count_digits--));
		x=x/10;
	}
	return(sum==n);
}
	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("print a num to check disarium or not  =");
int n=sc.nextInt();
System.out.println(check(n)? "Disarium number": "Not a Disarium Number");
sc.close();
	}

}
