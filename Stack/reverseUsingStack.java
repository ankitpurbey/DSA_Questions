package Stack;

import java.util.Stack;

public class reverseUsingStack {
    public static String reveString(String str){
        Stack<Character> s = new Stack<>();
        for(int i=0; i<str.length(); i++){
            s.push(str.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        while (!s.isEmpty()) {
            char curr = s.pop();
            sb.append(curr);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str ="aktpi";
        System.out.println(reveString(str));
    }
    }

