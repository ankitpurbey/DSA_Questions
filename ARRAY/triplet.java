package ARRAY;

public class triplet {
    public static int tripletElement(int arr[],int m){
        int count =0;
        for(int i=0;i<arr.length-1; i++){
            if(arr[i]==arr[i+1] || arr[i]==arr[i]+1){
                count++;
            }

        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] ={1,2,2,2};
        int m =2;
        System.out.println(tripletElement(arr, m));
    }
}
