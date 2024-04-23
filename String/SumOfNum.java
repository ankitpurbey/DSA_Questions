package String;

public class SumOfNum {
    public static int sumNum(String str){
        String sum ="0";
        for(int i=0; i<str.length(); i++){
            char s =str.charAt(i);
            if(Character.isDigit(s)){
                sum+= s;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        String str ="ankit12ki";
        System.out.println(sumNum(str));
    }
}
