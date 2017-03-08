
public class mianHandler {
	
	public static void main (String[] args) throws Exception{
		System.out.println("This is Victor's Parking Garage");
		ParkingGarage g = new ParkingGarage(2,2);
		AccessController ac = new AccessController(g);
		
		Vehicle v1 = new Vehicle();
		Vehicle v2 = new Vehicle();
		Vehicle v3 = new Vehicle();
		Vehicle v4 = new Vehicle();
		Vehicle v5 = new Vehicle();
		ac.enterCar(v1);
		ac.enterCar(v2);
		ac.enterCar(v3);
		ac.enterCar(v4);
		ac.enterCar(v5);
	}

}
