package session4;

public class ques21a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int nst1=1;
		int nsp=2*n-3;
		int nst2=1;
		int row=1;
		while(row<=n){
			int cst1=1;
			int cst2=1;
			int csp=1;
			while(cst1<=nst1){
				System.out.print("* ");
				cst1++;
			}
			while(csp<=nsp){
				System.out.print("  ");
				csp++;
			}
			while(cst2<=nst2){
				System.out.print("* ");
				cst2++;
			}
			System.out.println();
			row++;
			nst1++;
		    nst2++;
		    if(row==n)
		    	nst2--;
			nsp-=2;
			
		}

	}

}
