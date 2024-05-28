public class oddOrEven {
    public static void oddEven(int n){
        int bitMask =1;
        if( (n & bitMask)==0){
            System.out.println("even");
        }
        else{
            System.out.println("Odd");
        }
    }
    public static void main(String[] args) {
        oddEven(3);
        oddEven(4);
    }
}
