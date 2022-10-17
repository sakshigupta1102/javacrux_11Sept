package session9;

public class rotatearray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public void rotate(int[] nums, int k) {
	       k= k% nums.length; 
	      reverse(nums,0,nums.length-1);
	      reverse(nums,0,k-1);
	      reverse(nums,k,nums.length-1);

	       }
	       public void reverse(int[] nums , int lo, int hi){
	           while(lo<hi){
	               int temp = nums[lo];
	               nums[lo] = nums[hi];
	               nums[hi] = temp;
	               lo++;
	               hi--;
	           }
	       }

}
