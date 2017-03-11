
public class ParkingSlot {

	private Vehicle car;
	
	public ParkingSlot(){
		car = null;
	}
	
	public void getParked(Vehicle v){
		this.car=v;
	}
	
	public boolean getOccupiedStatus(){
		return car!=null;
	}
	
	public Vehicle leaveSlot(){
		return this.car;
	}

}
