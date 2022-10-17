package session10;

public class rainwater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public int trap(int[] height) {
	        int l = height.length;
	       int[] left = new int[l];
	       int[] right = new int[l];
	       left[0] = height[0];
	       for(int i=1;i<l;i++){
	           left[i] = Math.max(height[i],left[i-1]);
	       }
	       right[l-1] =height[l-1];
	       for(int i=l-2;i>=0;i--){
	           right[i] = Math.max(height[i] , right[i+1]);
	       }
	       int ans=0;
	       for(int i=0;i<l;i++){
	           ans+= Math.min(left[i],right[i])-height[i];

	       }
	       return ans;




	    }

}
