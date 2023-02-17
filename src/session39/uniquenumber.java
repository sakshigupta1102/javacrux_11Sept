package session39;

public class uniquenumber {

	public static void main(String[] args) {
		int[] num ={10,20,30,40,50,50,40,30,20};
		int ans=0;
		for(int i:num){
			ans = ans ^ i;
		}
		System.out.println(ans);
		

	}

}
