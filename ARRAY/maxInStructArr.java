package ARRAY;

public class maxInStructArr {
    public static findMax(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            int t = (arr[i].feet)*12 + (arr[i].inches);
            max = Math.max(max,t);
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] ={1,2,2,1};
        System.out.printl(findMax);
    }
}
