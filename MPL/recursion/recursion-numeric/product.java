/*
Without using a division or multiplication operator and without using iteration, define a recursive method named named product that accepts two int parameter, m and k, and calculates and returns 
the product of m times k. You can count on m>=0 and k>=0.  */

public class product {
    public int product(int m, int k){
        if(k==0){
            return m;
        } else if (k==1){
            return (m);
        } else {
            return (product(m,k-1)+m);
        }
    }
}
