package ARRAY;

import java.util.Arrays;

public class subsetArr {
    public static boolean subsetOrNot(int arr[],int arr2[]){
        Arrays.sort(arr);
        Arrays.sort(arr2);
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr2.length; j++){
            if(arr[i]!=arr[j]){
                return false;
            }
        }
        }
        return true;
        
    }
    public static void main(String[] args) {
        int arr[] ={2,3,1,5,7};
        int arr2[] ={4,1,6,8,5,9};
        System.out.println(subsetOrNot(arr, arr2));
    }
}
/*
 OUTPUT
 false
 */
