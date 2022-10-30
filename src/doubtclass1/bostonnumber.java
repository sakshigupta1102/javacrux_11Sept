package doubtclass1;

import java.util.*;
public class bostonnumber {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        long temp=n;
        long fact=2;
        long ans=0;
        while(fact<n){
            while(n%fact==0){
                ans+= sum(fact);
                n=n/fact;
            }
            fact++;

        }
        //if n is prime
        if(n>2)
        ans+= sum(n);
        if(ans==sum(temp)) System.out.print(1);
        else System.out.print(0);
    }
   
    
    public static long sum(long n){
        long ans=0;
        while(n>0){
            ans+=(n%10);
            n=n/10;
        }
        return ans;
    }
}