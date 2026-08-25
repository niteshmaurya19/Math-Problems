public class FirstDigit {
    public int FirstDig(int n){
        int a=0;
        while(n>0){
            a=n % 10;
            n=n/10;
        }
        return a;
}
public static void main(String[] args) {
    FirstDigit dig =new FirstDigit();
    int result=dig.FirstDig(123);
    System.out.println(result);
}
}
