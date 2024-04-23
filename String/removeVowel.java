package String;
import java.util.*;

public class removeVowel {
    public static void vowel(String str){
        for(int i=0; i<str.length();i++){
            if(str.charAt(i)=='a'|| str.charAt(i)=='e'|| str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                
                continue;// if any vowel encounterd then it will bw skipped 
            }
            else{
                System.out.print(str.charAt(i));
            }
        }
    }

    public static void main(String[] args) {
        String str = "take u forward";
        vowel(str);
    }
    
}
