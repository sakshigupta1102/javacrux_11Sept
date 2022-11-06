package session13;

import java.util.ArrayList;

import session10.arary2ddemo;

public class arraylistops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {10,20,30,30,40,80,90};
		int[] arr2 = {5,7,8,10,15,20,30,80,85,90,100,600,900};
		ArrayList<Integer> ans = commontwoarrs(arr1, arr2);
		System.out.println(ans);
	}
	public static ArrayList<Integer> commontwoarrs(int[] arr1 , int[] arr2){
		int i=0;
		int j=0;
		ArrayList<Integer> ans = new ArrayList<Integer>();
		while(i<arr1.length && j<arr2.length){
			if(arr1[i] > arr2[j]){
				j++;
			}
			else if(arr1[i] < arr2[j]){
				i++;
			}
			else{
				ans.add(arr1[i]);
				i++;
				j++;
			}
		}
		return ans;
		
	}

}
