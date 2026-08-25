// import java.util.Scanner;

public class PrimeNumber {
    public int SumOfDigit(int n){
        int sum=0;
        // int n;
        // Scanner sc=new Scanner(System.in);
        // System.out.println("enter the number");
        // n=sc.nextInt();
        while(n>0){
            int a=n%10;
            sum=sum+a;
            n=n/10;
        }
        return sum;
    // System.out.println("sum is:  "+sum);
}
    public static void main(String[] args) {
        PrimeNumber p=new PrimeNumber();
    int result= p.SumOfDigit(123);
        System.out.println(result);
    }
}
