package recursion;

public class increasingNum {
    public static void incNum(int n){
        // Base case
        if(n==1){
            System.out.println(1 +" ");
            return;
        }
        incNum(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        int n =5;
        incNum(n);
    }
}
