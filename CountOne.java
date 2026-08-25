import java.util.Scanner;

public class CountOne {
    public void Count(){
        int count=0;
        Scanner bc=new Scanner(System.in);
        System.out.println("Enter the value of N");
        int n=bc.nextInt();
        for(int i=1;n>=i;i++){
            if(i%10==1||i/10==1){
                count++;
            }
        }
        for(int i=1;n>=i;i++){
            if(i%10==1&&i/10==1){
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        CountOne count1=new CountOne();
        count1.Count();
    }
}