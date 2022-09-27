package session4;

public class ques21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int row=1;
		int nst1=1;
		int nsp=2*n-3;
		int nst2=1;
		while(row<=n){
			int cst1=1;
			int csp=1;
			int cst2=1;
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
			nst1++;
			nsp-=2;
			if(row<n-1)
			nst2++;
			row++;
			System.out.println();
		}
		
		

	}

}
