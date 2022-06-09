package javasessions;

public class IncrementalAndDecrementalOperators {

	public static void main(String[] args) {
		
		//1. post increment:
		int a = 1;
		int b = a++;
		System.out.println(a);//2
		System.out.println(b);//1
		
		int c = -98;
		int d = c++;
		System.out.println(c);//-97
		System.out.println(d);//-98
		
		int p = 101;
		int q = p++;
		System.out.println(p);//102
		System.out.println(q);//101
		
		//2. pre increment
		int h = 1;
		int g = ++h;
		System.out.println(h);//2
		System.out.println(g);//2
		
		int f = -1099;
		int s = ++f;
		System.out.println(f);
		System.out.println(s);
		
		//3. post decrement:
		int t = 2;
		int r = t--;
		System.out.println(t);//1
		System.out.println(r);//2
		
		int x = -99;
		int y = x--;
		System.out.println(x);//-100
		System.out.println(y);//-99
		
		//4. pre decrement
		int v = 2;
		int n = --v;
		System.out.println(v);//1
		System.out.println(n);//1
		
		
		int m = 2;
		System.out.println(m++);
		System.out.println(m);
		
		int mm = -99;
		System.out.println(--mm);
		System.out.println(mm);
		
		int sum = 1;
		System.out.println(sum+++10);//11
		System.out.println(sum+10);//12
		
		int total = 1;
		//System.out.println(++total+10);//12
		System.out.println(++total+10+total++);
		
		System.out.println(total);
		
		System.out.println(10+20);
		System.out.println(20/10);
		System.out.println(10 * 20);
		System.out.println(40 - 20);
		
		System.out.println(10>5);
		System.out.println(20<4);
	}

}
