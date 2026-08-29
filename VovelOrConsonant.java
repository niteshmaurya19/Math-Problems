public class VovelOrConsonant {
    public String VovelConsonantChecker(String s){
        if(s=="a"||s=="e"||s=="i"||s=="o"||s=="u"||s=="A"||s=="E"||s=="I"||s=="O"||s=="U"){
            return "vowel";
        }
        else{
            return "consonant";
        }
    }
    public static void main(String[] args) {
        VovelOrConsonant vc=new VovelOrConsonant();
        String result =vc.VovelConsonantChecker("B");
        System.out.println(result);
        
    }
}
