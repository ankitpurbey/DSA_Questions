package ARRAY;

public class reverse {
    public static void getReverse(int arr[]){
        int start =0;
        int end = arr.length-1;
        for(start=0; start<end; start++){
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int arr[] ={3,4,5,6,7};
        getReverse(arr);
        for(int i=0; i<arr.length; i++){
            
        }
    }
}
