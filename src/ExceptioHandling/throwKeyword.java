package ExceptioHandling;

public class throwKeyword {

	public static void main(String[] args) {

		try {
			throw new Exception("MYEXCEPTION");
		} catch (Exception e) {
			System.out.println("SOME EXCEPTION IS COMING....");
			e.printStackTrace();

			try {
				int i = 9 / 0;
			} catch (ArithmeticException e1) {
				System.out.println("AE is coming...");
				e1.printStackTrace();
			}

		}

		String data = null;

		try {
			if (data == null) {
				throw new Exception("DATANOTFOUNDEXCEPTION");
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("data not found....");
		}

	}

}
