package String;

public class sameChar_in_Strings {
    public static int common(String a, String b){
        int count =0;
        a =a.toLowerCase();
        b = b.toLowerCase();
        for(int i=0; i<a.length(); i++){
            if(a.charAt(i)==b.charAt(i)){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String a = "choice";
        String b = "chance";
        System.out.println(common(a, b));
    }
    
}

/* OUTPUT is 4 because charAt position 0,1,4 and 5 are 
same in a and b
 
 */




