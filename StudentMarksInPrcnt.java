import java.util.Scanner;

public class StudentMarksInPrcnt {
    public double SumOfMarksInPrcnt(int n){
        int sum=0;
        double total=n*100.0;
        double pcntg;
        Scanner num = new Scanner(System.in);
        for(int i=1;i<=n;i++){
        System.out.println( "enter the "+(i)+"st subject marks");
        int a=num.nextInt();
        sum=sum+a;
        }
        pcntg=(sum/total) * 100;
        return pcntg;
    }
    public static void main(String[] args) {
        StudentMarksInPrcnt marks =new StudentMarksInPrcnt();
        double result = marks.SumOfMarksInPrcnt(5);
        System.out.println("total obtained percentage is:  "+ result+"%");
    }
}
