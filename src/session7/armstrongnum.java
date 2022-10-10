package session7;

public class armstrongnum {

	public static void main(String[] args) {
		int lo= 5;
        int hi =9474;
        //System.out.println(isarmstrong(n));
        rangeofarmstrong(lo, hi);
	}
	public static int count_of_digits(int num){
		int count=0;
		while(num!=0){
			count++;
			num= num/10;
			
		}
		return count;
	}

	public static boolean isarmstrong(int num){
		int cod = count_of_digits(num);
		int ans=0;
		int temp = num;
		while(num!=0){
			int rem = num%10;
			ans+= Math.pow(rem, cod);
			num=num/10;
			
		}
		if(ans==temp) return true;
		else return false;
	}
	
	public static void rangeofarmstrong(int lo,int hi){
		for(int i=lo;i<=hi;i++){
			boolean isarm =isarmstrong(i);
			if(isarm) System.out.print(i+ "  ");
		}
	}
	
	
	
}
