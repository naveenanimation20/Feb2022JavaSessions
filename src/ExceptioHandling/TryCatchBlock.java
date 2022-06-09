package ExceptioHandling;

public class TryCatchBlock {
	String name;

	public static void main(String[] args) {

		System.out.println("A");
		System.out.println("A");
		TryCatchBlock obj = null;
		try {
			int i = 9 / 3;
			obj.name = "Monika";
			System.out.println("hii");
			System.out.println("hii");
			System.out.println("hii");
		} 
		catch (ArithmeticException e) {
			System.out.println("AE exception is coming...");
			e.printStackTrace();
		}
		catch (NullPointerException e) {
			System.out.println("NPE exception is coming...");
			e.printStackTrace();
		}
//		catch (Error e) {
//			System.out.println(" exception is coming...");
//			e.printStackTrace();
//		}

		System.out.println("B");
		System.out.println("B");
		System.out.println("B");

	}

}
