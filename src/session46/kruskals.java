package session46;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class kruskals {
	HashMap<Integer, HashMap<Integer, Integer>> map;

	public kruskals(int v) {
		this.map = new HashMap();
		for(int i=1;i<=v;i++){
			map.put(i, new HashMap());
		}
	}
	public void addedge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}
	public class edgepair{
		int v1;
		int v2;
		int cost;
		public edgepair(int v1, int v2, int cost) {
			this.v1 = v1;
			this.v2 = v2;
			this.cost = cost;
		}
		@Override
		public String toString(){
			return  v1+" "+v2+" @ " + cost;  
		}
	}
	public ArrayList<edgepair> getalledges(){
		ArrayList<edgepair> list = new ArrayList();
		for(int e1: map.keySet()){
			for(int e2:map.get(e1).keySet()){
				edgepair p1 = new edgepair(e1, e2, map.get(e1).get(e2));
				list.add(p1);
			}
		}
		return list;
		
	}
	public void kruskalalgorithm(){
		int ans=0;
		disjointsetunion dsu = new disjointsetunion();
		for(int k: map.keySet()){
			dsu.createset(k);
		}
		ArrayList<edgepair> list = getalledges();
		Collections.sort(list, new Comparator<edgepair>(){
			@Override
			public int compare(edgepair e1, edgepair e2){
				return e1.cost- e2.cost;
			}
		});
		for(edgepair edge: list){
			int e1 = edge.v1;
			int e2 = edge.v2;
			int cost = edge.cost;
			int re1 = dsu.find(e1);
			int re2 = dsu.find(e2);
			if(re1== re2){
				//nothing
			}
			else{
				System.out.println(edge);
				ans += cost;
				dsu.union(e1, e2);
			}
			
		}
		System.out.println(ans);
		
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		kruskals ks = new kruskals(n);
		int m = scan.nextInt();
		for(int i=0;i<m;i++){
			int v1 = scan.nextInt();
			int v2= scan.nextInt();
			int cost= scan.nextInt();
			ks.addedge(v1, v2, cost);
			
		}
		ks.kruskalalgorithm();
	}
	
}


