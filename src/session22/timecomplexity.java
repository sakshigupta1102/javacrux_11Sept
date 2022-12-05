package session22;

public class timecomplexity {

	public static void main(String[] args) {
	//O(N)	
		int i=0;
		int n=0;;
		int k=0;
		while(i<n){
			System.out.println(i);
			i++;
		}
     
		i=1;
		while(i<=n){
			System.out.println(i);
			i=i*2;
		}
		
		while(n>0){
			
			n=n/2;
		}
		while(i<=n){
			System.out.println(i);
			i=i+2;
			i=i+3;
		}
		while(i<=n){
			i=i+k;
		}
		while(i<=n){
			System.out.println(i);
			i=i*2;
			i=i*3;
		}
		
		for( i=1;i*i <= n ;i++){
			System.out.println("hey");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
