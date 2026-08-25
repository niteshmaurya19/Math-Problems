import java.util.Scanner;

public class EligibilityOfVoting {
    public String Eligibility(int age){
        if(age>18){
            return "yes";
        }
        else{
            return "no";
        }
    }
    public static void main(String[] args) {
        EligibilityOfVoting eliglbe=new EligibilityOfVoting();
        String result = eliglbe.Eligibility(23);
        System.out.println(result);
    }
}
