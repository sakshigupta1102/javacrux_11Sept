package session37;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class jobscheduling {
	public static void main(String[] args) {
		int[] jobid = { 1, 2, 3, 4 };
		int[] deadline = { 4, 1, 1, 1 };
		int[] profit = { 20, 10, 40, 30 };
		ArrayList<Job> list = new ArrayList();
		for (int i = 0; i < 4; i++) {
			list.add(new Job(jobid[i], deadline[i], profit[i]));
		}
		Collections.sort(list, new jobcomp());
		int max = 0;
		for (int i = 0; i < deadline.length; i++) {
			max = Math.max(deadline[i], max);
		}
		int[] clock = new int[max];
		Arrays.fill(clock, -1);
		for (int i = 0; i < list.size(); i++) {
			loop2: for (int j = list.get(i).deadline - 1; j >= 0; j--) {
				if (clock[j] == -1) {
					clock[j] = list.get(i).profit;
					break loop2;

				}
			}
		}
		int ansprofit = 0;
		int noans = 0;
		for (int i = 0; i < clock.length; i++) {
			if (clock[i] != -1) {
				ansprofit += clock[i];
				noans++;
			}
		}
		System.out.println(ansprofit);
		System.out.println(noans);
	}
}

class Job {
	int id, profit, deadline;

	Job(int x, int y, int z) {
		this.id = x;
		this.deadline = y;
		this.profit = z;
	}
}

class jobcomp implements Comparator<Job> {
	@Override
	public int compare(Job j1, Job j2) {
		if (j1.profit < j2.profit)
			return 1;
		else if (j1.profit > j2.profit)
			return -1;
		else if (j1.deadline > j2.deadline)
			return -1;
		else
			return 1;
	}

}
