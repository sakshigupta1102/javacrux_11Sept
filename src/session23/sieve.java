package session23;

public class sieve {

	public static void main(String[] args) {
		
		int n=20;
		boolean[]  sieve = new boolean[n+1];
		for(int i=0;i<sieve.length;i++){
			sieve[i] = true;
		}
		sieve[0] = false;
		sieve[1] = false;
		for(int table = 2 ;  table*table <= n ; table++){
			if(sieve[table] == false){
				continue;
			}
			for(int mult = 2 ; mult * table <= n ; mult++){
				sieve[mult*table] = false;
			}
		}
		
		for(int i=0;i<=n;i++){
			if(sieve[i] == true){
				System.out.print(i+" ");
			}
		}
		
		
		

	}

}
