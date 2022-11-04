package doubtclass2;

public class productexceptself {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public int[] productExceptSelf(int[] arr) {
	        int[] left = new int[arr.length];
	        
	        left[0] =1;
	        for(int i=1;i<left.length;i++){
	            left[i] = left[i-1]*arr[i-1];
	        }
	        
	        int r=1;
	        
	        for(int i= left.length-1;i>=0;i--){
	            left[i] = left[i] * r;
	            r=r*arr[i];
	        }
	        
	        
	        
	        return left;
	        
	        
	        
	        
	        
	        
	    }

}
