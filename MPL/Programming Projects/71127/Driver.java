import java.util.Scanner;
public class TestScores
{
    
    double total = 0;
    
    public TestScores(double[] arr) throws IllegalArgumentException
    {
        int n = arr.length;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 0 || arr[i] > 100){
                throw new IllegalArgumentException("Test scores must have a value less than 100 and greater than 0.");
                
            } else {
                
                total += arr[i];
            }
        }
        System.out.println((float)total/n);
    }

    
}

public class Driver
{
    public static void main(String[] args) throws IllegalArgumentException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of test scores:");
        int numOfScores = sc.nextInt();
        double[] a = new double[numOfScores];
        for(int i = 0; i < numOfScores; i++){
            System.out.print(String.format("Enter test score %d:",i+1));
            a[i] = sc.nextDouble();
        }

        try {
            TestScores scores = new TestScores(a);
            
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}