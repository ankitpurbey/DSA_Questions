package ARRAY;

public class arrSum {
    public static int sum(int arr[]){
        int count =0;
        for(int i=0; i<arr.length; i++){
            count+=arr[i];
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5};
        System.out.println(sum(arr));
        }
}
