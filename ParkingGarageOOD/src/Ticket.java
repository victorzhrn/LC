
public class Ticket {
	
	private long start, end;
	
	public Ticket(){
		 initialize();
	}
	
	public void initialize(){
		start = System.currentTimeMillis();
		System.out.println("ticket start at: "+start);
	}
	
	public void finish(){
		end = System.currentTimeMillis();
		System.out.println("ticket end at: "+start);
	}
	
	public long getParkingTime(){
		if (end==0L) finish();
		System.out.println("vehicle parked for: "+(end-start));
		return end-start;
	}

}
