package ARRAY;

public class CountZeros {
    public static int count(int arr[]){
        int count =0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0){
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        int arr[] ={1,3,0,4,5,0,0,4,0};
        System.out.println(count(arr));
    }
    
}
