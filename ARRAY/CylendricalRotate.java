package ARRAY;

public class CylendricalRotate {
    public static void Rotate(int arr[],int n){
        for(int i=n-1; i>0; i--){
            int temp = arr[i];
            arr[i] =arr[i-1];
            arr[i-1] = temp;
        }
    }
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5};
        int n= arr.length;
         int functnRotate =Rotate(arr, n);
         System.out.println(functnRotate);
    }
}
