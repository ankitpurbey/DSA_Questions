package ARRAY;

import java.util.Arrays;

public class fittingArray {
    public static boolean fitOrNot(int arr[],int brr[]){
        Arrays.sort(arr);
        Arrays.sort(brr);
        for(int i=0; i<arr.length; i++){
            if(arr[i]>brr[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[] ={2,4,6,3};
        int brr[] ={3,1,6,4};
        System.out.println(fitOrNot(arr, brr));
    }
}
/*OUTPUT
  FALSE 
  because after sorting the both array
   arr[0]>brr[0]
