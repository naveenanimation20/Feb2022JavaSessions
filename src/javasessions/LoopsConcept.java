package javasessions;

public class LoopsConcept {

	public static void main(String[] args) {

		// 1. while loop:
		// 1 to 10:

		int i = 1;
		while (i <= 10) {
			System.out.println(i);// 1
			i++;
			// ++i;
			// i = i+1;
		}

		System.out.println("-------");
		//
		int p = 1;
		while (p <= 100) {
			System.out.println(p);
			if (p % 5 == 0) {
				System.out.println("Hi...");
				break;
			}
			p++;
		}
		
		System.out.println("-------");
//		boolean flag = false;
//		while(!flag) {
//			System.out.println("welcome to Taj Hotel ....");
//		}
		
		//use cases of while: whenever we are not sure about number of iterations
		//1. lazy loading : LinkedIn, Swiggy, FB
		//2. Pagination: 1 2 3 4 5 ..20..80....100
		//3. page loading: 10, 20, 40, 100 
		//4. element is getting displayed on the page : 10, 20, 40
		//5. carousel:
		//6. calendar: 
		
		System.out.println("-------");

		//2. for loop: if we are sure about number of iterations
		//1 to 10:
		int a=1;
		for( ; a<=10 ;) {
			System.out.println(a);//1 2 3 ....10
			//a++;
			a=a+1;
		}
		
		System.out.println("-------");

		//0 2 4 6 8 10 -- even numbers --> % operator (even % 2 ==0)
		for(int even=0; even<=10; even=even+2) {
			System.out.println(even);//0 2 4 6 8 10 
			//even++;
		}
		
		//1 3 5 7 9 -- odd numbers
		
		System.out.println("-------");
		
		for(;true;) {
			System.out.println("Bye!!");
			break;
		}
		
		for(; ;) {
			System.out.println("Bye!!");
			break;
		}
		
		System.out.println("-------");
		for(byte b = 1; b<=10; b++) {
			System.out.println(b);
		}

		System.out.println("-------");
		for(double d = 1.1; d<=10.1; d++) {
			System.out.println(d);
		}
		
		System.out.println("---a to z----");
		for(char c='a'; c<='z'; c++) {
			System.out.println(c + ":"+ (int)c);
		}
		
		System.out.println("---a to z----");
		for(char c='a'; c<='z'; c++) {
			System.out.println(c+0);
		}
		
		//use cases :
		//drop down -- 10 values : 
		//total links: 100 - text of each link
		//suggestion list: google search, amazon search
		
		//do-while loop:
		//1 to 10:
		int k = 1;
		do {
			k++;
			System.out.println(k);//234567891011
			//break;
		} 
		while (k<=10);
		
		//use cases:
		//1. if element is immediately present on the page or not
		
		
		//
//		int m = 10;
//		while(m>6) {
//			System.out.println("Naveen");
//			m--;
//		}
		int m = 10;
		if(m>6) {
			System.out.println("Bye");
			m++;
		}
		
		for(float f1 = 12.33f; f1<15; f1++) {
			System.out.println(f1);
		}
		
		System.out.println(0.1+0.2);
		System.out.println(0.1+0.4);

	}

}
