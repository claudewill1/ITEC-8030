/*
 Given non-negative integers x and n, x taken to the nth power can be defined as:

    x to the 0th power is 1
    x to the nth power can be obtained by multiplying x to the n-1'th power with x 

Write a long-valued method named power that accepts an two int parameters x and n (in that order) and recursively 
calculates and returns the value of x taken to the n'th power. 
*/
public class power {
    public int power(int x, int n){
        if(n==0) return 1;
        if(n==1) return x;
        return power(x,n-1)*x;
    }
}
