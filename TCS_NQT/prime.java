package TCS_NQT;

public class prime {
    public static void primtOrNot(int n){
        while(n>0){
            if(n%1==0 && n%n==0){
                System.out.println("prime");
            }
            else{
                System.out.println("NOt prime");
            }
        }
    }
    public static void main(String[] args) {
        int n =4;
        primtOrNot(n);
    }
    
}
