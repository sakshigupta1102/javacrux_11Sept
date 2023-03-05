package session44;

import java.util.*;

public class graph {
	HashMap<Integer, HashMap<Integer, Integer>> map;

	public graph(int v) {
		this.map = new HashMap();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap());
		}
	}

	public void addedge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}

	public boolean containsedge(int v1, int v2) {
		return map.get(v1).containsKey(v2) && map.get(v2).containsKey(v1);

	}

	public boolean containsvertex(int v1) {
		return map.containsKey(v1);
	}

	public int noofedges() {
		int cnt = 0;
		for (int key : map.keySet()) {
			HashMap<Integer, Integer> smallmap = map.get(key);
			cnt += smallmap.size();

		}
		return cnt / 2;
	}

	public void removeedge(int v1, int v2) {
		map.get(v1).remove(v2);
		map.get(v2).remove(v1);
	}

	public void removevertex(int v1) {

		for (int key : map.keySet()) {
			map.get(key).remove(v1);
		}
		map.remove(v1);
	}

	public void display() {
		for (int key : map.keySet()) {
			System.out.println(key + " ---->  " + map.get(key));
		}
	}

	public boolean haspath(int src, int dis, HashSet<Integer> visited) {
		if (src == dis) {
			return true;
		}
		visited.add(src);
		for (int nbrs : map.get(src).keySet()) {
			if (!visited.contains(nbrs)) {
				boolean ans = haspath(nbrs, dis, visited);
				if (ans)
					return true;
			}
		}
		visited.remove(src);
		return false;

	}

	public void printallpath(int src, int dis, HashSet<Integer> visited, String ans) {
		if (src == dis) {
			System.out.println(ans+" "+src);
			return;
		}
		visited.add(src);
		for (int nbrs : map.get(src).keySet()) {
			if (!visited.contains(nbrs)) {
				 printallpath(nbrs, dis, visited, ans+" " + src);
			}
		}
		visited.remove(src);
	}
}
