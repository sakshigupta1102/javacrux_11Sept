package doubtclass1;

import java.util.Scanner;

public class pat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int row;
        int cst;
        int cst2;
        int csp;
        int nst=1;
        int nst2=1;
        int nsp=(2*n)-1;
        for(row=1;row<=(2*n)+1;row++)
        {int val=n;
            for(cst=1;cst<=nst;cst++)
            {
                System.out.print(val);
//                if(cst<nst)
                	val--;
            }
            for(csp=1;csp<=nsp;csp++)
            {
                System.out.print(" ");
            }
            val++;
            for(cst2=1;cst2<=nst2;cst2++)
            {
            	System.out.print(val);
            	
            //	if(cst<nst)
            	   val++;
            }
            System.out.println();
            if(row<=n)
            {
//            	if (row==n) {
//            		 nst2++;
//                	break;
//            	     }
//            	 else
             		nst2++;
                nst++;
                nsp-=2;
            }
            else
            {
                nst--;
                nsp+=2;
                nst2--;
            }
        }

	}

}
