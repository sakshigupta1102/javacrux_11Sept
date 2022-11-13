package session14;
public class cointoss {
	public static void main(String[] args) {
		cointoss(3, "");
	}
	public static void cointoss(int n, String ans){
		if(n==0){
			System.out.println(ans);
			return;
		}
		cointoss(n-1,ans+"H");
		cointoss(n-1, ans+"T");	
	}
}
