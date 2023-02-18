package session40;

public class mincostclimbingstairs {
	public static void main(String[] args) {

	}
	public static int mincost(int[] cost, int i){
		if(i>= cost.length ) return 0;
		int first = mincost(cost, i+1);
		int second = mincost(cost, i+2);
		int ans = Math.min(first, second) + cost[i];
		return ans;
	}
	public static int mincostTD(int[] cost, int i,int[] strg){
		if(i>= cost.length ) return 0;
        if(strg[i] != -1) return strg[i];
		int first = mincostTD(cost, i+1,strg);
		int second = mincostTD(cost, i+2,strg);
		int ans = strg[i] = (Math.min(first, second) + cost[i]);
		return ans;
	}
	public int mincostBU(int[] cost){
		int[] strg = new int[cost.length];
		strg[0] = cost[0];
		strg[1] = cost[1];
		for(int i=2;i<cost.length;i++){
			int prev = strg[i-1];
			int prevofprev= strg[i-2];
			strg[i] = Math.min(prev, prevofprev) + cost[i];
		
		}
		return Math.min(strg[strg.length-1], strg[strg.length-2]);
		
	}
	
	
	
	
	
    
}
