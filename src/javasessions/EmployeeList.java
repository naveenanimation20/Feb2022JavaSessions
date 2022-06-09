package javasessions;

import java.util.ArrayList;

public class EmployeeList {

	public static void main(String[] args) {

		ArrayList ar = new ArrayList(5);
		//vc = 5, pc = 0
		System.out.println(ar.size());
		
		ar.add(100);//0
		ar.add(200.22);//1
		ar.add("testing");//2
		ar.add(true);//3
		ar.add('a');//4
		
		//li = 0
		//hi = size() - 1
		System.out.println("li = " + 0);
		System.out.println("length = " + ar.size());
		System.out.println("hi = " + (ar.size()-1));
		
		ar.add(600);//5
		
		System.out.println("length = " + ar.size());

		ar.add(700);//6
		System.out.println("length = " + ar.size());

		ar.add(800);//7
		
		System.out.println("------");
		//print all the values from arraylist: loop
		
		for(int i = 0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		System.out.println(ar);
		
		System.out.println("------");

		ArrayList<Integer> marksList = new ArrayList<Integer>();//pc = 0, vc = 10
		marksList.add(200);//0
		marksList.add(1200);//1
		marksList.add(1122);//2
		System.out.println(marksList.size());
		
		for(int i=0; i<marksList.size(); i++) {
			System.out.println(marksList.get(i));
		}
				
		
		System.out.println("------");

		System.out.println(marksList);
		System.out.println("------");

		
		for(Integer e : marksList) {
			System.out.println(e);
		}
		
		System.out.println("------");

		//
		ArrayList<Double> bmiList = new ArrayList<Double>();//pc = 0, vc = 10

		//
		ArrayList<String> produtList = new ArrayList<String>();
		produtList.add("macbook pro");
		produtList.add("macbook air");
		produtList.add("iph 13");
		produtList.add("iPad");
		
		System.out.println(produtList.size());

		for(String e : produtList) {
			System.out.println(e);
		}
		
		System.out.println("------");

		//emp info: 
		ArrayList<Object> empInfo = new ArrayList<Object>();
		empInfo.add("Vani");//0
		empInfo.add(25);//1
		empInfo.add('f');//2
		empInfo.add(34.55);//3
		empInfo.add(false);//4
		
		System.out.println(empInfo);
		
		System.out.println("------");//5

		for(int i=0; i<empInfo.size(); i++) {
			System.out.println(empInfo.get(i));
				if(empInfo.get(i).equals(true)) {
					System.out.println("move to US");
				}
		}
		
		System.out.println("------");

		for(Object e : empInfo) {
			System.out.println(e);
		}
		
		
	}

}
