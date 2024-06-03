package ARRAY;

import java.util.Arrays;

public class kLargest {
    public static int[] largest(int arr[],int k,int n) {
    
        int ans[] = new int[k];
        Arrays.sort(arr);
        for(int i=0; i<n; i++){
            ans[i] = arr[n-1-i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] ={1,89,67,45,34,78};
        int n = arr.length;
        int k =3;
        System.out.println(largest(arr, k, n));
    }
}
