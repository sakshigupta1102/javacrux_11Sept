package session13;

import java.util.ArrayList;

public class sumoftwonums {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] two ={9,9,9,9,5,1};
		int[] one ={2,3,5,8};
       System.out.println(sum(one, two));
	}
	public static ArrayList<Integer> sum(int[] one ,int[] two){
		int i=one.length-1;
		int j=two.length-1;
		int carry=0;
		ArrayList<Integer> ans = new ArrayList<Integer>();
		while(i>=0 || j>=0){
		 int sum=carry;
			if(i>=0){
				sum+=one[i];
			}
			if(j>=0){
				sum+=two[j];
			}
			int rem = sum%10;
			carry = sum/10;
			ans.add(0,rem);
			i--;
			j--;
			
		}
		if(carry > 0){
			ans.add(0,carry);
		}
		return ans;
		
		
	}

}
