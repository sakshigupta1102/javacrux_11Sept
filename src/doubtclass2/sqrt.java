package doubtclass2;

public class sqrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public int mySqrt(int x) {
	        long lo=0;
	        long hi=x;
	        long ans=0;
	        if(x==0) return 0;
	        if(x==1) return 1;
	        while(lo<=hi){
	            long mid = (lo+hi)/2;
	            if(mid*mid > x) hi = mid-1;
	            else if (mid*mid < x){
	                ans=mid;
	                lo=mid+1;
	            }
	            else{
	                ans=mid;
	                break;
	                
	            }
	        }
	        return (int)ans;



	       
	   }

}
