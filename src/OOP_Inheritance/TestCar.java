package OOP_Inheritance;

public class TestCar {
	
	final static String name = "Naveen";

	public static void main(String[] args) {
				
		final int days = 7;//constant variable
		System.out.println(days * 10);
		

		BMW b = new BMW();
		b.start();//overriden
		b.stop();//inherited
		b.refuel();//inherited
		b.autoParking();//individual
		b.engine();//inherited
		BMW.seating();
		System.out.println(b.speed);
		System.out.println(BMW.wheels);		
		
		Audi au = new Audi();
		au.start();
		au.stop();
		au.refuel();
		au.theftSafety();
		au.engine();
		Audi.seating();//inherited
		Car.seating();
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		
		//Top/Up Casting:
		//child class object can be referred by parent class ref variable
		Car c1 = new BMW();
		c1.start();
		c1.stop();
		c1.refuel();
		c1.engine();
		
		Car c2 = new Audi();
		
		
		Vehicle v1 = new BMW();
		v1.engine();
		
		Vehicle v2 = new Audi();
		
		//down casting:
		//parent class object can be referred by child class ref variable
//		BMW b1 = (BMW)new Car();
//		b1.start();
		
	}

}
