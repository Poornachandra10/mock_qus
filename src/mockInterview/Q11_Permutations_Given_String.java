package mockInterview;

public class Q11_Permutations_Given_String {

	public static void printPermunts(String str, String ans) {
		if(str.length()==0) {
			System.out.println(ans+" ");
			return;
		}
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			
			String ros = str.substring(0, i)+str.substring(i+1);
			printPermunts(ros,ans+ch);
		}
	}
	
	
	
	
	public static void main(String[] args) {
String str= "abc";
printPermunts(str, " ");
			
	

}}