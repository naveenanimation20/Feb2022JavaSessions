package javasessions;

public class DataTypes {

	public static void main(String[] args) {

		//data types:
		//strict type: 

		//two types of data types:
		//1. Primitive Data Types: No Object (not 100% OOP)
		//A. Boolean Type: boolean: true/false
		//B. Numeric Type: 
					//B.1: Character Type: char
					//B.2: Integral Value: 
							//a. Integer: byte, short, int, long
							//b. Floating-point: float, double
		
		//2. Non Primitve Data Types: Class, Arrays, Interface, Abs Class, Objects
		
		
		//1. byte:
		//size: 1 byte = 8 bits
		//range: -128 to 127 (-2^7 to 2^7-1)
		byte b = 10;
		b = 20;
		System.out.println(b);
		byte b1 = 127;
		byte b2 = 0;
		byte b3 = -90;
		System.out.println(b3+b);
		
		//2. short:
		//size: 2 bytes = 2x8 = 16 bits
		//range: -32768 to 32767 (-2^15 to 2^15-1)
		short s1 = 15;
		short s2 = 1;
		short s3 = -200;
		
		//3. int:
		//size: 4 bytes = 4x8 = 32 bits
		//range: -2147483648 to 2147483647 (-2^31 to 2^31-1)
		int i = 10;
		int age = 300;
		int index = 1000;
		int pop = 123456;
		
		//4. long:
		//size: 8 bytes = 8x8 = 64 bits
		//range: -2^63 to 2^63-1 (-9223372036854775808 to 9223372036854775807)
		long population = 121212121L;
		long distance = 89898998989L;
		System.out.println(distance);
		
		//5. float:
		//size: 4 bytes = 32 bits
		//range: can take upto 7 decimal digits
		float f1 = 12.33f;
		float f2 = (float)34.55;
		System.out.println(f1);
		
		//6. double:
		//size: 8 bytes = 64 bits
		//range: can take upto 16 decimal digits
		double d1 = 12.333;
		double d2 = 100;
		System.out.println(d2);
		
		//7. char: single quote and single digit value
		//size: 2 bytes = 16 bits
		char c1 = '1';
		char c2 = 'a';//97
		char c22 = 'b';//98
		char c3 = '$';
		char c4 = 'C';
		char c5 = ' ';
		//a-z --> 97 to 122
		//A-Z --> 65 to 90
		//0-9 --> 48 to 57
		System.out.println(c2+c22);//195
		System.out.println(c22);//b
		System.out.println((int)c22);
		System.out.println((short)c22);
		System.out.println((float)c22);

		
		//8. boolean
		//size: ~1 bit
		boolean flag = true;
		boolean fg = false;
		boolean isActive = true;
		
		
		System.out.println(10+20);
		System.out.println(20-10);
		System.out.println(10 * 20);
		System.out.println(20/10);
		System.out.println(isActive);
		
		//System.out.println(9/0);//ArithmeticException
		System.out.println(0/9);//0
		
		System.out.println(9.0/0);//Infinity
		System.out.println(9/0.0);//Infinity
		//System.out.println(0/0);//ArithmeticException
		System.out.println(0.0/0);//NaN - not a number
		System.out.println(0.0/0.0);//NaN
		
		System.out.println(9/2);//4
		System.out.println(9.0/2);//4.5
		System.out.println(9/2.0);//4.5
		System.out.println(9.0/2.0);//4.5
		
		System.out.println(9 % 2);//1
		System.out.println(8 % 2);//0
		System.out.println(100 % 3);
		
	}

}
