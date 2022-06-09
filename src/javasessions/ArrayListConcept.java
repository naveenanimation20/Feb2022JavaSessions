package javasessions;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {

		//ArrayList -- default class
		//index/order based collection
		
		ArrayList ar = new ArrayList();//vc = 10
		System.out.println(ar.size());//pc=0

		ar.add(100);//0
		ar.add(200);//1
		
		System.out.println(ar.size());//2
		
		ar.add(300);//2
		ar.add(400);//3
		
		System.out.println(ar.size());//4
		
		System.out.println(ar.get(0));
		System.out.println(ar.get(3));
		//System.out.println(ar.get(4));//IOB

		ar.add(500);//4
		System.out.println(ar.get(4));
		ar.add(1, 1100);
		System.out.println(ar.get(1));
//		ar.add(8, 1500);//IOB
//		System.out.println(ar.get(8));

		
		ArrayList pr = new ArrayList(20);//vc = 20
		//pc = 20, vc = 0
		//20th index value, vc = 20/2 = 10
		//pc = 30, vc = 30/2 = 15
		//pc = 45, vc = 45/2 = 22
		
		
		
		
	}

}
