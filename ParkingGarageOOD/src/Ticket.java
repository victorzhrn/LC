
public class Ticket {
	
	private long start, end;
	
	public Ticket(){
		 initialize();
	}
	
	public void initialize(){
		start = System.currentTimeMillis();
	}
	
	public void finish(){
		end = System.currentTimeMillis();
	}
	
	public long getParkingTime(){
		if (end==0L) finish();
		return end-start;
	}

}
