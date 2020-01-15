package tasks;

import java.util.ArrayList;
import java.util.Calendar;

public class TaskThread extends Thread {

	private ArrayList<Task> list;

	public TaskThread(ArrayList<Task> list) {

		this.list = list;
	}

	@Override
	public void run() {

		while (true) {
			while (true) {
				Calendar cal = Calendar.getInstance();
				for (int i = 0; i < list.size(); i++) {
					if (cal.get(Calendar.MINUTE) > list.get(i).getMinute()) {
						System.out.println("a minute late for : "
								+ list.get(i).getTask());
					}

				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println("dont wake me up again");
				}
			}

		}

	}
}
