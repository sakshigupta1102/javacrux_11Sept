package session5;

public class pascal_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row=0;
		int nst=0;
		while(row<n){
			int cst=0;
			int ncr=1;
			while(cst<=nst){
				System.out.print(ncr+" ");
				ncr = (ncr*(row-cst))/(cst+1);
				cst++;
			}
			
			nst++;
			row++;
			System.out.println();
		}

	}

}
