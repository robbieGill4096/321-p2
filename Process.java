
public class Process implements Comparable<Process>{

	
	//
	private int priority_level;
	private int time_remaining;
	private int arrival_time;
	private int time_not_processed;
	public Process(int priority_level,int time_remaining, int arrival_time) {
		this.priority_level = priority_level;
		this.time_remaining = time_remaining;
		this.arrival_time = arrival_time;
		
	}
	
	

	@Override
	public int compareTo(Process o) {
		// TODO Auto-generated method stub
		
		return 0;
	}
	public int getArrivalTime() {
		return this.arrival_time;
	}
	public void reduceTimeRemaining() {
		this.time_remaining-=1;
		
	}
	public boolean finish() {
		// TODO Auto-generated method stub
		return false;
	}
	public int getTimeRemaining() {
		// TODO Auto-generated method stub
		return this.time_remaining;
	}
	public int getPriority() {
		// TODO Auto-generated method stub
		return this.priority_level;
	}



	public void resetTimeNotProcessed() {
		this.time_not_processed =0;
		
	}

}
