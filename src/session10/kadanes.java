package session10;

public class kadanes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int maxSubArray(int[] nums) { 
        int currsum=0;
        int maxsum= Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(currsum<0) currsum=0;
            currsum+= nums[i];
            maxsum = Math.max(maxsum,currsum);
        }
        return maxsum;   
    }

}
