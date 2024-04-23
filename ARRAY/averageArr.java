package ARRAY;

public class averageArr {
    public static int average(int arr[]){
        int n = arr.length;
        int total =0;
        //int avg =0;
        for(int i=0; i<n; i++){
            total+=arr[i];
             int avg = total/n;
             System.out.println(avg);
        }
    }
    return total;
        
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5};
        System.out.println(average(arr));
    }
}
