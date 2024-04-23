package String;

public class palindrome {
    String s ="racecar";
    for(int i=0; i<s.length(); i++){
        if(s.charAt(0)== s.charAt(7)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}

