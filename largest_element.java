import java.util.*;
public class largest_element{
    public static void main(String args[]){
    int arr[]={1,2,3,4,5};
    System.out.println("the largest element is" +(arr));
    }
    static int sort(int arr[]){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }


}
