package javasessions;

import java.util.Arrays;

public class ArrayConcept {

	public static void main(String[] args) {

		//limitations of array:
		//1. size is fixed: static array: to overcome this, we use ArrayList (Dynamic Array)
		//2. stores only similar types of values: can use object array/dynmaic array
		
		//1. int array:
		int i[] = new int[4];
		//i[-1] = 5;//AIOB
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		//i[4] = 50;//AIOB
		System.out.println(Arrays.toString(i));

		
		System.out.println("li = "+ 0);
		int len = i.length;
		System.out.println("length = " + len);
		System.out.println("hi = " + (len-1));
		
		System.out.println(i[0]);
		System.out.println(i[3]);
		//System.out.println(i[4]);//ArrayIndexOutOfBoundsException
		//AIOB
		
		//System.out.println(i[-1]);//AIOB
		
		System.out.println(i[0]+i[1]);
		
		//to print all the values from array: iterate the array: use loop:
		for(int k=0; k<i.length ; k++) {
			System.out.println(k+":"+i[k]);//10 20 30 40 
		}
		
		
		System.out.println("-------");
		//for each loop:
		int counter = 0;
		for(int e : i) {
			System.out.println(counter + ":" + e);
			counter++;
		}
		System.out.println("-------");

		//double array:
		double d[] = new double[3];
		d[0] = 12.33;
		d[1] = 23.44;
		
		for(double e : d) {
			System.out.println(e);
		}
		
		//char array:
		char c[] = new char[3];
		c[0] = 'a';
		c[1] = '3';
		c[2] = '$';
		
		//String array:
		String names[] = new String[3];
		names[0] = "Java";
		names[1] = "Python";
		names[2] = "C#";
		
		System.out.println(Arrays.toString(names));
		for(String e : names) {
			System.out.println(e);
				if(e.equals("Java")) {
					System.out.println("java is my fav prog lang....");
					break;
				}
		}
		
		System.out.println("-------");
		//Object array: static array: can store diff types of data
		Object ob[] = new Object[5];
		ob[0] = "Monika";
		ob[1] = 40;
		ob[2] = 34.55;
		ob[3] = true;
		ob[4] = 'f';
		
		for(Object e : ob) {
			System.out.println(e);
		}
		
		System.out.println("-------");
		//array literals: static array:
		int a[] = {10,20,40,50,1,3};
		System.out.println(a.length);
		System.out.println(a[0]);
		System.out.println(a[a.length-1]);
		
		for(int e : a) {
			System.out.println(e);
		}
		
		System.out.println(Arrays.toString(a));//[10,20,....]
		
		//
		int marks[] = new int[] {10,100,1000,20,30};
		System.out.println(marks.length);


		String aadharNumber = "1234567890";
		
		//8 AM IST
	}

}
