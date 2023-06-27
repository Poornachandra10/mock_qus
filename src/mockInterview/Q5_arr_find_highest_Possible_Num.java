package mockInterview;


import java.sql.SQLOutput;
import java.util.Arrays;

public class Q5_arr_find_highest_Possible_Num {

	public static void main(String[] args) {
		int arr []= {19,81,2,41,61,59,28,69,76,88};
		System.out.println("printing highest possible numers in the array");
Arrays.sort(arr);

System.out.println("After sorting"+Arrays.toString(arr));
System.out.println("addind the highest numbers");
System.out.println((arr[arr.length-1]+arr[arr.length-2]));
System.out.println("printing the first two values");
System.out.println((arr[0]+arr[1]));
	}
}
