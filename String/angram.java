package string;

import java.lang.reflect.Array;

public class angram {
    public static boolean isAnagram(String str1, String str2) {
        char[] arr1 =str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(arr1.length!= arr2.length){
            return false;
        }
        for(int i=0; i<arr1.length; i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
}
public static void main(String[] args) {
    String str1 = "listen";
    String str2 = "silent";
    System.out.println(isAnagram(str1, str2));
}
}
