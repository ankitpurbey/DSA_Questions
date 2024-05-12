package ARRAY;

public class transitionIndex {
    public static int tpoint(int arr[]){
        for(int i=0; i<arr.length; i++){
            if(arr[i] ==1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] ={0,0,0,1,0,1,1};
        System.out.println(tpoint(arr));

    }
    
}
