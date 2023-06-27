package mockInterview;

import java.util.Calendar;
import java.util.Scanner;

public class Find_Last_Date_of_month {

	public static void main(String[] args) {
		// Write a Java program to get the last date of the month.

		 Scanner sc=new Scanner (System.in);

		 System.out.println("Enter any month name to find the last date of the month :");
		String str=sc.nextLine();
str=str.toLowerCase();

if(str.equals("january")) {
	System.out.println(" janusry month has 31 days");
}
else if(str.equals("february")) {
	System.out.println("february has 28 days");
}
else if(str.equals("march")) {
	System.out.println("march has 31 days");
}
else if(str.equals("april")) {
	System.out.println("april has 30 days");
}
else if(str.equals("may")) {
	System.out.println("may has 31 days");
}
else if(str.equals("june")) {
	System.out.println("june has 30 days");
}
else if(str.equals("july")) {
	System.out.println("july has 31 days");
}
else if(str.equals("august")) {
	System.out.println("august has 31 days");
}
else if(str.equals("september")) {
	System.out.println(" september has 30 days");
}
else if(str.equals("october")) {
	System.out.println("october has 31 days");
}
else if(str.equals("november")) {
	System.out.println("november has 30 days");
}
else if(str.equals("december")) {
	System.out.println("december has 31 days");
}
else  {
	System.out.println("print valid month name to find the last date of the month");
}










		/*
		 * Calendar cal = Calendar.getInstance(); System.out.println();
		 * cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
		 * System.out.println(cal.getTime());
		 */
	}

}
