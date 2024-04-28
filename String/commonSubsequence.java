package String;

public class commonSubsequence {
    public static int common(String s1,String s2){
        for(int i=0; i<s1.length(); i++){
            for(int j=0; j<s2.length(); j++){
                if(s1.charAt(i)==s2.charAt(j)){
                    return 1;
                }
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        String s1 = "Ankit";
        String s2 ="knigf";
        System.out.println(common(s1, s2));
    }
    
}
