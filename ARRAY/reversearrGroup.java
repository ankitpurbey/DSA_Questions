package ARRAY;

public class reversearrGroup {
    public static void reverse(int arr[]){
        int n = arr.length;
        int start =0;
        for(int i=0; i<n-2; i++){
            int temp = arr[i];
            arr[i] =start;
            start =temp;
            //System.out.println(arr[n-2]);
        }
        System.out.println(start);
        int end =0;
        for(int j =3; j<n; j++){
            int temp2 =arr[j];
            arr[j] =end;
            end =temp2;
        }
        System.out.println(end);
    }
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5};
        reverse(arr);
}
}
