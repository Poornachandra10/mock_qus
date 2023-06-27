package mockInterview;

import java.util.LinkedList;

public class LinkedListProgram {

	public static void main(String[] args) {

//Write a Java program to insert some elements at the specified 
//position into a linked list.

		LinkedList<String> list = new LinkedList<String>();
		list.add("poorna");
		list.add("Chandra");
		list.add("Akila");
		System.out.println("created at first :" + list);

		LinkedList<String> new_list = new LinkedList<String>();
		new_list.add("new_Poorna");

		list.addAll(3, new_list);
		System.out.println("newly created name list: " + list);
	}

}
