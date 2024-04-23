package TCS_NQT;

public class reverseArr {
    public static void reverse(int arr[]){
        int n = arr.length;
        for(int i=0; i<n;i++){
            int temp =arr[n];
            arr[n] =arr[i];
            arr[i] =temp;
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,6};
        reverse(arr);
        
    }
    
}
