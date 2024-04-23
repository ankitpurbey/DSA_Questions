package ARRAY;
import java.util.Arrays;

public class smallest {
    public static boolean subset(int arr1[], int arr2[]){
        for(int i=0; i<arr1.length;i++){
            Arrays.sort(arr1);
        
        for(int j=0; j<arr2.length; j++){
            Arrays.sort(arr2);
        
        if(arr1[i]==arr2[j]){
            return true;
        }
    }
}
return false;
}
    
    public static void main(String[] args) {
        int arr1[] ={1,2,3,4,5};
        int arr2[] ={2,4,5,2,1};
        System.out.println(subset(arr1, arr2));
    }
}
