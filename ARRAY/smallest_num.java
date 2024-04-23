package ARRAY;

public class smallest_num {
    public static int getSmallest(int num[]){
        int smallest =Integer.MAX_VALUE;
        for(int i=0; i<num.length; i++){
            if(smallest>num[i]){
                smallest =num[i];
            }
        }
        return smallest;

    }
    public static void main(String[] args) {
        int num[] ={2,3,7,45,1};
        System.out.println(getSmallest(num));
    }
}
