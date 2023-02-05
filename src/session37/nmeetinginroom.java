package session37;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class nmeetinginroom {

	public static void main(String[] args) {
		int[] arrival = { 1, 3, 0, 5, 8, 5 };
		int[] dept = { 2, 4, 6, 7, 9, 9 };
		ArrayList<pair> list = new ArrayList();
		for (int i = 0; i < arrival.length; i++) {
			list.add(new pair(arrival[i], dept[i]));
		}
		System.out.println(list);
		Collections.sort(list, new paircomp());
		int ans= 1;
		int limit = list.get(0).end;
		for(int i=1;i<list.size();i++){
			if(list.get(i).start > limit){
				ans++;
				limit = list.get(i).end;
			}
		}
		System.out.println(ans);
		

	}

}

class pair {
	int start;
	int end;

	public pair(int start, int end) {
		this.start = start;
		this.end = end;
	}

	@Override
	public String toString() {
		return "pair [start=" + start + ", end=" + end + "]";
	}

}
class paircomp implements Comparator<pair> {

	@Override
	public int compare(pair o1, pair o2) {
		if (o1.end < o2.end)
			return -1;
		else if (o1.end > o2.end)
			return 1;
		else if (o1.start < o2.start)
			return -1;
		else
			return 1;
	}

}
