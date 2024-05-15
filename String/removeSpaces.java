package String;

public class removeSpaces {
    public static String rSpaces(String str){
        // Solve using String Builder 
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            if (str.charAt(i)!= ' ') {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str ="i m Ankit ";
        System.out.println(rSpaces(str));
    }
}
