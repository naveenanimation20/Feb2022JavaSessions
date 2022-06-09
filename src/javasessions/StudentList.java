package javasessions;

import java.util.ArrayList;

public class StudentList {

	public static void main(String[] args) {

		
		ArrayList<Integer> marksList = new ArrayList<Integer>();

		marksList.add(100);//0
		marksList.add(200);//1
		marksList.add(300);//2
		marksList.add(400);//3
		marksList.add(500);//4
		
		
//		System.out.println(marksList.size());
//
//		System.out.println(marksList.get(3));
//
//		marksList.remove(3);
//		
//		System.out.println(marksList.get(3));
//		
		marksList.remove(100);
		
		System.out.println(marksList.get(0));
		//Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 100 out of bounds for length 5


	}

}
