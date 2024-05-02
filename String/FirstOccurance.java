package String;

public class FirstOccurance {
    public static String fstOccurance(String str){
        char s ='';
        for(int i=0; i<str.length(); i++){
            for(int j=0; j>str.length(); j++){
                if(str.charAt(i) ==str.charAt(j)){
                    s = charAt(i);
                }
            }
        }
        return s;
    }
    public static void main(String[] args) {
        String str ="abhgsb";
        System.out.println(fstOccurance(str));
    }
}
