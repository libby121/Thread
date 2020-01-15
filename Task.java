package tasks;

import java.util.Calendar;

public class Task {

	private String task;
	
	private Calendar cal = Calendar.getInstance();
	
	
	

	public Task(String task, Calendar  cal) {
		
		this.task = task;
		this.cal=Calendar.getSeconds;
	}

	

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}
	
	public Calendar getDueTime(){
		return Calendar.getInstance()
;	}
	
	public int getHour(){
		return Calendar.HOUR;
	}

	public int getMinute(){
		return Calendar.MINUTE;
	}
	
	public Calendar getCal(int Hour, int Minute, int seconds) {
		return cal;
	}

	public void setCal(Calendar cal) {
		this.cal = cal;
	}
	
	
	
	
}
