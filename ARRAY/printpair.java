package ARRAY;

public class printpair {
    public static void main(String[] args) {
        int pair[] ={2,4,6,8,7};
        for(int i=0; i<pair.length; i++){
            int curr =pair[i];
            for(int j=i+1; j<pair.length;j++){
                System.out.println("(" + curr+"," + pair[j] +")");
            }
            System.out.println();
        }
        
    }
}
