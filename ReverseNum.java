// import java.util.Scanner;

public class ReverseNum {
    public int ReverseNumber(int n){
        int r=0;;
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter the value of Number: ");
        // int n=sc.nextInt();

        while(n>0){
            int a=n%10;
            r=r*10+a;
            n=n/10;
        }
        // System.out.println("Reverse of the above Number is:  "+r);
        return r;
    }
    public static void main(String[] args) {
        ReverseNum x=new ReverseNum();
        int result= x.ReverseNumber(123);
        System.out.println(result);
    }
}
