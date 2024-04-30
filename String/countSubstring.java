package String;

public class countSubstring {
    public static int substring(String s){
        int count =0;
        for(int i=0; i<s.length(); i++){
            int low =0;
            int high =0;
            for(int j=i; j<s.length(); j++){
                if(s.charAt(j)>='A' && s.charAt(j)<='z'){
                    high++;
                }
                if(s.charAt(j)>='a' && s.charAt(j)<='z'){
                    low++;
                }
                if(low==high){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String s ="abgydg";
        System.out.println(substring(s));
    }
}
