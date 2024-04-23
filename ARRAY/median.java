package ARRAY;
import java.util.*;

public class median {
    public static void middle(int arr[]){
        int n =arr.length;
        Arrays.sort(arr);
        if(n%2==0){
            int arr1 = (n/2)+1;
            int arr2 =n/2;
            System.out.println(arr[arr1]+ "" +arr[arr2]);
        }
        else{
            System.out.println(arr[n/2+1]);
        }
            }
        
    public static void main(String[] args) {
        int arr[] ={1,3,4,5,2,7};
        middle(arr);
    }
}
