package WrapperClass;

public class DataConversion {

	public static void main(String[] args) {

		String x = "100";
		System.out.println(x+20);
		
		//String to int:
		int i = Integer.parseInt(x);//100
		System.out.println(i+20);
		
//		String y = "100A";
//		int j = Integer.parseInt(y);//
//		System.out.println(j+20);

		
		//String to double:
		String t = "12.33";
		System.out.println(t+20);
		
		double d = Double.parseDouble(t);
		
		System.out.println(d+20);
		
		//int to String:
		int p = 100;
		String p1 = String.valueOf(p);//"100"
		System.out.println(p1+30);
		
		String remote = "true";
		if(Boolean.parseBoolean(remote)) {
			System.out.println("running test cases on grid");
		}
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);


	}

}
