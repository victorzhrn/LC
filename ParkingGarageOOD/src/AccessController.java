
public class AccessController {
	
	private ParkingGarage garage ;
	
	public AccessController(ParkingGarage pg){
		garage = pg;
	}
	
	/**
	 * return true if there is available slot for vehicle 
	 * and issue a ticket to the vehicle
	 * return false if there is no available parking slot
	 * @param v
	 * @return
	 * @throws Exception
	 */
	public boolean enterCar(Vehicle v) throws Exception{
		boolean result = garage.parkInGarage(v);
		if (result) v.getATicket();
		return result;
	}

}
