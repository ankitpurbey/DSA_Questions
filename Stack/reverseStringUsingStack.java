package Stack;

import java.util.Stack;

public class reverseStringUsingStack {
    public static String reverse(String str){
        String s ="";
        Stack <Character> stack = new Stack<>();
        for(int i=0; i<str.length(); i++){
            stack.push(str.charAt(i));
        }
        int i=0;
        while (!stack.isEmpty()) {
            s+= stack.pop();
        }
        return s;
    }
    public static void main(String[] args) {
        String str ="achfgf";
        System.out.println(reverse(str));
    }
}
