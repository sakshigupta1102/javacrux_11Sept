package session19;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class subset1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3 };
//		ArrayList<ArrayList<Integer>> big = new ArrayList();
//		ArrayList<Integer> small = new ArrayList();
		subset1(arr, "",0);
		//System.out.println(big);
	}

	public static void subset1(int[] arr, String ans, int vidx) {

		if (vidx == arr.length) {
			System.out.println(ans);
			return;
		}
        subset1(arr, ans + arr[vidx], vidx + 1);
		subset1(arr, ans, vidx + 1);
		

	}
	public static void subset1(int[] arr, ArrayList<Integer> list, int vidx) {

		if (vidx == arr.length) {
			System.out.println(list);
			return;
		}
	
		list.add(arr[vidx]);
        subset1(arr,list , vidx + 1); //adding
	    list.remove(list.size()-1);
		subset1(arr, list, vidx + 1); // not adding
		

	}

	public static void subset1(int[] arr, ArrayList<Integer> small , int vidx , ArrayList<ArrayList<Integer>> big) {

		if (vidx == arr.length) {
			ArrayList<Integer> temp = new ArrayList(small);
			big.add(temp);
			return;
		}
	
		small.add(arr[vidx]);
        subset1(arr,small , vidx + 1,big); //adding
        small.remove(small.size()-1);
		subset1(arr, small, vidx + 1,big); // not adding
		

	}

	
	
	
}

