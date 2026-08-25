import java.util.Scanner;

public class StudentMarks {
    public int SumOfMarks(){
        int sum=0;
        Scanner num = new Scanner(System.in);
        for(int i=1;i<=5;i++){
        System.out.println( "enter the "+(i)+"st subject marks");
        int a=num.nextInt();
        sum=sum+a;
        }
        return sum;
    }
    public static void main(String[] args) {
        StudentMarks marks =new StudentMarks();
       int result = marks.SumOfMarks();
       System.out.println("total marks of student :  "+result);
    }
}
