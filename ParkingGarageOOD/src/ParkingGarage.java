import java.util.Arrays;

public class ParkingGarage {
	
	private ParkingSlot[][] slots;
	private int levels, nums;
	private int emptySlots;
	
	public ParkingGarage(){
		
	}
	
	public ParkingGarage(int levels, int nums){
		initialize(levels,nums);
	}
	
	/**
	 * @param levels: number of levels
	 * @param nums: number of parking slot on each level
	 */
	public void initialize(int levels, int nums){
		slots = new ParkingSlot[levels][nums];
		emptySlots = nums*levels;
		this.levels=levels;
		this.nums = nums;
		for (int i =0; i < levels; i++){
			for (int j = 0; j< nums; j++){
				slots[i][j] = new ParkingSlot();
			}
		}
	}
	
	/**
	 * return true if there a vehicle can be parked in garage
	 * return false if there is no space;
	 * @param v
	 * @return
	 * @throws Exception
	 */
	
	public boolean parkInGarage(Vehicle v) throws Exception{
		if (emptySlots<=0){
			System.out.println("sorry, there is no slot for your vehicle");
			return false;
		}else{
			assignSlot(v);
			emptySlots--;
			return true;
		}
	}
	
	/**
	 * this function returns index of assigned parking slot
	 * @return
	 * @throws Exception 
	 */
	public int[] assignSlot(Vehicle v) throws Exception{
		int[] assignedIndex = new int[2];
		for (int i = 0;i< levels; i++){
			for (int j = 0; j < nums; j++){
				if (!slots[i][j].getOccupiedStatus()){
					slots[i][j].getParked(v);
					assignedIndex[0] = i;
					assignedIndex[1] = i;
					System.out.println("the vehicle is assigned at "+Arrays.toString(assignedIndex));
					return assignedIndex;
				}
			}
		}
		throw new Exception("slot is not found");
	}
	

}
