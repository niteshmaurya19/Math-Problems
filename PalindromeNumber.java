import java.util.Scanner;

public class PalindromeNumber {
    public void isPalindrome(){
        int n;
        int r=0;
        Scanner p=new Scanner(System.in);
        System.out.println("ENter the Number to Check palindrome");
        n=p.nextInt();
        int m=n;
        while(n>0){
            int a=n%10;
            r=r*10+a;
            n=n/10;
        }
        if(m==r){
            System.out.println("yes it is a palindrome number----");
        }
        else{
            System.out.println("its not a palindrome number----");
        }
    }
    public static void main(String[] args) {
        PalindromeNumber x=new PalindromeNumber();
        x.isPalindrome();
    }

}
