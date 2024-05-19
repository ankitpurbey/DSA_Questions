package GeeksMediumLevel;

public class smallestNegativeMissing {
    public static int smallestNegativeMiss(int n, int arr[]){
        int miss =1;
        for(int i=0; i<n; i++){
            if(arr[i]==miss){
                miss++;
            }
        }
        return miss;
    }
    public static void main(String[] args) {
        int n=6;
        int arr[] = new int[n];
        System.out.println(smallestNegativeMiss(n, arr));
    }
}
