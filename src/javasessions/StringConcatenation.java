package javasessions;

public class StringConcatenation {

	public static void main(String[] args) {

		
		int a = 100;
		int b = 200;
		
		double d1 = 12.33;
		double d2 = 32.33;
		
		String x = "hello";
		String y = "selenium";
		
		System.out.println(a+b);//30
		System.out.println(x+y);//helloselenium
		System.out.println(a+b+x+y);//300helloselenium
		System.out.println(x+y+a+b);//helloselenium100200
		System.out.println(x+y+(a+b));//helloselenium300
		
		System.out.println(a+b+d1+d2+x+y);
		
		System.out.println(a+b+x+y+d1+d2);
		
		System.out.println("the value of a "+a);
		System.out.println("the value of b "+b);
		System.out.println("the sum is : " + (a+b));
		
		System.out.println('a'+'b');//98+97=195
		System.out.println('a'+'b'+x+y);
		System.out.println('a'+'b'+a+b+x+y);
		
		//-127 to 128
		byte p = 20;
		byte q = 80;
		int z = p+q;
		System.out.println(z);
		

	}

}
