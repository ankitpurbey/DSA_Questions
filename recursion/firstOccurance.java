package recursion;

public class firstOccurance {
    public static int firstOccur(int arr[],int i,int x){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==x){
            return i;
        }
        return firstOccur(arr,x, i+1);
    }
    public static void main(String[] args) {
        int arr[] ={2,3,1,6,7};
        int x = 1;
        System.out.println(firstOccur(arr, 1,x));
    }
}
