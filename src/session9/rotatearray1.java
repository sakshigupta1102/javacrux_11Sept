package session9;

public class rotatearray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void rotate(int[] nums, int k) {
	       k= k% nums.length; 
	       for(int j=0;j<k;j++){
	        int save = nums[nums.length-1];
	        for(int i=nums.length-1 ; i>0;i--){
	              nums[i] = nums[i-1];
	        }
	        nums[0] = save;
	       }
	        
	    }

}
