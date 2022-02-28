/*
 Two non-negative integers x and y are equal if either:

    Both are 0, or
    x-1 and y-1 are equal 

Write a boolean-method named equals that recursively determines whether its two int parameters 
are equal and returns true if they are and false otherwise. 
*/
public class Equals {
  public boolean equals(int x, int y)  {
      if((x<0)||(y<0)) return false;
      if((x==0)&&(y==0)) return true;
      return equals(x-1,y-1);
  }
}
