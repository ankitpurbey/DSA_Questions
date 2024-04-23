package ARRAY;

public class largest_num {
    public static int largest(int num[]){
        int largestt =0;
        for(int i=0; i<num.length;i++){
            if(largestt<num[i]){
                largestt =num[i];
            }
            
        }
        return largestt;
        
    } 

    public static void main(String[] args) {
        int num[]={2,6,3,9,4,5};
          System.out.println(largest(num));
    }
}
