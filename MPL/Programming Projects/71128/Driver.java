import java.util.Scanner;

class InvalidTestScore extends Exception {
    private String msg;

    public InvalidTestScore(String msg){
        this.msg = msg;
    }

    public String getMsg(){
        return msg;
    }

    public void setMsg(String msg){
        this.msg = msg;
    }
}

class TestScores {
    public TestScores(int[] a) throws InvalidTestScore {
        int n = a.length, total = 0;
        for(int i = 0; i < n; i++){
            if(a[i] > 100 || a[i] < 0){
                throw new InvalidTestScore("Invalid test score.");
            }
            else {
                total += a[i];
            }
        }
        System.out.println((float)total/n);
    }
}
public class Driver {
    public static void main(String[] args) throws InvalidTestScore {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of test scores:");
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            System.out.print(String.format("Enter test score %d:",i+1));
            a[i] = sc.nextInt();
        }

        try {
           new TestScores(a);
        } catch (InvalidTestScore e){
            System.out.println(e.getMessage());
        }
    }
}
