/*
 Consider a simple form of integer division: m / k where we are guaranteed that m>=0 and k>0. This can be computed as follows:

    The quotient is 0 when k is greater than m.
    Otherwise, the quotient is one more than (m-k)/k .

Write an int method named quotient that accepts two int parameters, m and k, and recursively calculates and returns the integer quotient of m/k. You can count on m>=0 and k>0. 
Do not use a division operator here! */

public class quotient {
    public int quotient(int m, int k){
        if(k==0) {
            return 0;
        } else if(m-k == 0) {
            return 1;
        } else if (m < k){
            return 0;
        } else {
            return quotient(m-k, k)+1;
        }
    }
}
