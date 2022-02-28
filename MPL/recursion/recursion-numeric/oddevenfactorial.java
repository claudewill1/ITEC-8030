/* The "odd/even factorial" of a positive integer n is represented as n  and is defined non-recursively as: (n)(n-2)(n-4)...(4)(2) if n is even and is (n)(n-2)(n-4)...(5)(3) (1) if n is odd. For example 7  equals 7*5*3*1 or 105 and 6  equals 6*4*2 or 48. Come up with a recursive definition for n  and use it to guide you to write a method definition for a method called oddevenfact that recursively calculates 
the odd/even factorial value of its single int parameter. The value returned by oddevenfact is a long.. 
*/
public class oddevenfactorial {
  public long oddevenfact(int n)  {
      if(n==0 || n==1) return 1;
      return n * oddevenfact(n-2);
  }
}
