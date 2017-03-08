
public class AccessController {
	
	private ParkingGarage garage ;
	
	public AccessController(ParkingGarage pg){
		garage = pg;
	}
	
	
	public boolean enterCar(Vehicle v) throws Exception{
		boolean result = garage.parkInGarage(v);
		if (result) v.getATicket();
		return result;
	}

}
