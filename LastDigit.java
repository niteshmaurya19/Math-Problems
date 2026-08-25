public class LastDigit {
    public int LastDig(int n){
        int a=0;
        while(n>0){
            a=n % 10;
            break;
        }
        return a;
}
public static void main(String[] args) {
    LastDigit dig =new LastDigit();
    int result=dig.LastDig(123);
    System.out.println(result);
}
}