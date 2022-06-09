package ExceptioHandling;

public class FinallyQuestion {

	public static int getMarks(String name) {
		System.out.println(name);
		if (name.equals("tom")) {
			try {
				int i = 9 / 3;
				//System.exit(1);
				return 100;
			} catch (ArithmeticException e) {
				System.out.println("AE is coming");
				return 60;
			}
			finally {
				System.out.println("finally code");
				//return 40;
			}
		} 
		else if (name.equals("peter")) {
			return 95;
		}
		else {
			return -1;
		}
	}

	public static void main(String[] args) {

		int m = getMarks("tom");
		System.out.println(m);

	}

}
