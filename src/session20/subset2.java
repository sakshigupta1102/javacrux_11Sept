package session20;

import java.util.ArrayList;

public class subset2 {
	public static void main(String[] args) {

		int[] arr = { 1, 1 ,2 };
		ArrayList<ArrayList<Integer>> big = new ArrayList();
		ArrayList<Integer> small = new ArrayList();
		subset2(arr, small, 0,big, true);
		System.out.println(big);
	}
	public static void subset2(int[] arr, ArrayList<Integer> small , int vidx , ArrayList<ArrayList<Integer>> big , boolean lastcall) 
	{

		if (vidx == arr.length) {
			ArrayList<Integer> temp = new ArrayList(small);
			big.add(temp);
			return;
		}
	
		if(lastcall == false && arr[vidx] == arr[vidx-1]){
			subset2(arr, small, vidx+1, big, false);
		}
		else{
		small.add(arr[vidx]);
        subset2(arr,small , vidx + 1,big,true); //adding
        small.remove(small.size()-1);
		subset2(arr, small, vidx + 1,big,false); // not adding
		}

	}
}

