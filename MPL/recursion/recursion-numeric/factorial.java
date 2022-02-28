

public class factorial {
    public long fact(int n){
        if(n<=1){
            return 1;
        } else {
            return(fact(n-1)*(long)n);
        }
    }
}
