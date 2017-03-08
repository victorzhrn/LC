
public class AccessController {
	
	private ParkingGarage garage ;
	
	public AccessController(ParkingGarage pg){
		garage = pg;
	}
	
	public boolean enterCar(Vehicle v) throws Exception{
		return garage.parkInGarage(v);
	}

}
