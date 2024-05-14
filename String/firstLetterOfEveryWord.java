package String;

public class firstLetterOfEveryWord {
    public static int firstLetter(String s){
        String a = s.charAt(0)+"";
        for(int i=0; i<s.length(); i++){
            if (s.charAt(i)=' ') {
                a += s.charAt(i+1);
                
            }
        }
        return a;
    }
    public static void main(String[] args) {
        String s = "I m Ankit";
    }
}
