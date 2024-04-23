package ARRAY;

public class printSubarray {
    public static void main(String[] args) {
        int arr[] ={2,4,6,8,5,6};
        for(int i=0; i<arr.length; i++){
            for(int j =i+1; j<arr.length; j++){
                for(int k=i; k<j; k++){
                    System.out.println(arr[k] +" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
