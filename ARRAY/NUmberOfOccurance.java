package ARRAY;

public class NUmberOfOccurance {
    public static int occurance(int arr[], int x){
        int count =0;
        for(int i=0; i<arr.lenght; i++){
            if(arr[i]!=x){
                return -1;
            }
            if(arr[i]==x){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,4,6,7};
        int x =4;
        System.out.println(occurance(arr, x));
    }
}
