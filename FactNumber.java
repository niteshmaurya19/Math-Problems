// import java.util.Scanner;

public class FactNumber {
    public int FactNum(int n){
        int fact=1;
        // Scanner sc=new Scanner(System.in);
        // System.out.println("enter the number");
        // int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            fact=fact*i;

        }
        // System.out.println("factorial of number is :"+fact);
        return fact;
    }
    public static void main(String[] args) {
        FactNumber a=new FactNumber();
      int factorial= a.FactNum(5);
      System.out.println(factorial);
    }
}
