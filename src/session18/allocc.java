package session18;

public class allocc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,2,3,4,3,2,1,1};
		int[] ans = allocc(arr, arr.length, 0, 1, 0);
		for(int a: ans){
			System.out.println(a);
		}
		

	}
	public static int[] allocc(int[] arr, int n,int idx, int item, int cnt){
		if(idx==n){
			return new int[cnt];
		}
		
		if(arr[idx] == item){
			int[] rr = allocc(arr, n, idx+1, item, cnt+1);
			rr[cnt] = idx;
			return rr;
		}else{
			int[] rr = allocc(arr, n, idx+1, item, cnt);
			return rr;
		}
	}

	
}
