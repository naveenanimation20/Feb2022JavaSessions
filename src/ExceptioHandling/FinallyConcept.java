package ExceptioHandling;

public class FinallyConcept {

	public static void main(String[] args) {

		try {
			int i = 9 / 0;
		} 
		catch (ArithmeticException e) {
			e.printStackTrace();
		}
		
		finally {
			System.out.println("finally block....");
		}
		
		
		try {
			int p = 10/0;
		}
		finally {
			System.out.println("final code....");
		}
		
		//DB connection:
		//make the connection oracle DB
		//try{
		//sql query hit --exception is coming....}
		//catch(){}
		//fetch the data
		//use the data
		//close the DB connection -- finally
		
		

	}

}
