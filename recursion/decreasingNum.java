package recursion;

public class decreasingNum {
    public static void decNum(int n){
        // Base case
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.println(n +" ");
        decNum(n-1);
    }
    public static void main(String[] args) {
        int n =10;
        decNum(n);
    }
}
