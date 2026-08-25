public class LeapYearChecker {
    public String LeapYear(int n){
        if(n%400==0||(n%4==0 && n%100!=0)){
            return "Yes Its a Leap Year";}

        else{
            return "No its a leap year";
        }
    }
    public static void main(String[] args) {
        LeapYearChecker leap = new LeapYearChecker();
        String result=leap.LeapYear(2000);
        System.out.println(result);
    }
}
