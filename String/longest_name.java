package String;

public class longest_name {
    public static String longest(String S[]){
        String str ="";
        for(int i=0;i<S.length(); i++){
            if(S[i].length()> str.length()){
                str = S[i];
            }
        }
        return str;
    }
    public static void main(String[] args) {
        String S[] ={"Ankit","aman","Lokesh"};
        System.out.println(longest(S));
    }
    
}
