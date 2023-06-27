package mockInterview;

import java.util.Scanner;
//Write a Java program to check two given strings whether any of them 
//appears at the end of the other string (ignore case sensitivity).
public class Given_TwoString_Any_Of_Them_Appers_At_The_End {

	public static void main(String[] args) {


Scanner sc=new Scanner(System.in);
System.out.println("enter the first string");
String str=sc.next();
str=str.toLowerCase();
System.out.println("enter the second string");
String str1=sc.next();
str1=str1.toLowerCase();
int len=str.length();
int len1=str1.length();
boolean ans;
if(len<len1) {
	String temp=str1.substring(len1-len, len1);
if(temp.compareTo(str)==0)
	ans=true;
else
ans=false;	
}else {
	String temp=str.substring(len-len1, len);
	if(temp.compareTo(str1)==0)
		ans=true;
	else
		ans=false;
}


System.out.println("The given strings are "+str+"  "+str1);
if(ans==true) {
	System.out.println("the string is presented in the first string");
}else {
	System.out.println("The second string is not presented in the first string");
}
	}

}
