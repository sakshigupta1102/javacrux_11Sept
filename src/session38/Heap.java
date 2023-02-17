package session38;

import java.util.ArrayList;

public class Heap {

	ArrayList<Integer> data = new ArrayList();

	public int size() {
		return data.size();
	}

	public void add(int item) {
		data.add(item);
		upheapify(data.size() - 1);
	}

	public void upheapify(int ci) {
		int pi = (ci - 1) / 2;
		if (data.get(ci) < data.get(pi)) {
			swap(ci, pi);
			upheapify(pi);
		}

	}

	private void swap(int ci, int pi) {
		int a = data.get(pi);
		int b = data.get(ci);
		data.set(ci, a);
		data.set(pi, b);

	}

	@Override
	public String toString() {
		return "" + this.data;
	}

	public int remove() {
		swap(0, data.size() - 1);
		int item = data.remove(data.size() - 1);
		downheapify(0);
		return item;
	}
	public void downheapify(int pi) {
		int c1 = 2 * pi + 1;
		int c2 = 2 * pi + 2;
		int mini = pi;
		if (c1 < data.size() && data.get(c1) < data.get(pi)) {
			mini = c1;
		}
		if (c2 < data.size() && data.get(c2) < data.get(mini)) {
			mini = c2;
		}
		if (mini != pi) {
			swap(pi, mini);
			downheapify(mini);

		}

	}

}
