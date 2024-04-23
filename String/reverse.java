package String;
import java.util.*;
public class reverse {
    // public static void reverseStr(String str){
    //     String result ="";
    //     for(int i=str.length();i>=0; i--){
    //         result += str.charAt(i);
    //     }
    // }
public static void main(String[] args) {
    String str ="hello";
    String result ="";
    for(int i=str.length()-1; i>=0; i--){
        result+= str.charAt(i);
    }
    
    System.out.println(result);
}
}
