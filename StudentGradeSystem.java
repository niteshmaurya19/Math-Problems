import java.util.Scanner;

public class StudentGradeSystem {
    public void GradeSystem(){
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter marks (0-100): ");
        int marks = sc.nextInt();
        String grade;
        if (marks >= 90) grade = "A+";
        else if (marks >= 75) grade = "A";
        else if (marks >= 60) grade = "B";
      else if (marks >= 50) grade = "C";
        else if (marks >= 35) grade = "D";
        else grade = "F";

        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }
    public static void main(String[] args) {
        StudentGradeSystem obj=new StudentGradeSystem();
        obj.GradeSystem();
    }
}
