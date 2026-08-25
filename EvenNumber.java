import java.util.Scanner;

public class EvenNumber{
    public void EvenNum(){
        int countEven=0;
        int countOdd=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i%2==0){
                countEven=countEven+1;

            }

            else{
                countOdd=countOdd+1;

            }


        }
        System.out.println(" total Even Numbers:  " +countEven);
        System.out.println("total Odd Numbers: "+countOdd);
    }

    public static void main(String[] args){
        EvenNumber obj=new EvenNumber();
        obj.EvenNum();

}}