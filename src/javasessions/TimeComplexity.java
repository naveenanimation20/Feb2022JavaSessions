package javasessions;

public class TimeComplexity {

	public static void main(String[] args) {

		
		
		int i = 10;
		System.out.println(i);
		
		//Big O -> O(1) -- constant time
		
		for(int p = 0; p<=10; p++) {
			System.out.println(p);
		}
		
		//1+n+n+n ==> 3n+1 (linear equation)
		//3n + 1 ==> 3n ==> O(n)
		
		
		for(int m = 0; m<=10; m++) {
			for(int n=0; n<=10; n++) {
				System.out.print(m+n+""+" ");
			}
		}
		
		//(1+n+n)(1+n+n+n)
		//(1+2n)(1+3n) ==> 1+3n+2n+6n^2 ==> 6n^2+5n+1 (Quadratic eq)
		//6n^2+5n ==> n(6n+5)==> 6n^2 ==> O(n^2)
		
		
		for(int m = 0; m<=10; m++) {
			for(int n=0; n<=10; n++) {
				for(int q=0; q<=10; q++) {
					System.out.print(m+n+q+""+" ");

				}
			}
		}
		
		//(1+2n)(1+2n)(1+3n) ==> 12n^3+n^+n+1 ==> O(n^3)
	}

}
