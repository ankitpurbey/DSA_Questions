package recursion;

import java.util.Stack;

public class insertAtBottom {
    public static Stack<Integer> insertX(Stack<Integer> st, int x){
        if(st.isEmpty()){
            st.push(x);
            return st;
        }
        int top = st.pop();
        Stack<Integer> s = insertX(st, x);
        s.push(top);
        return s;
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        int x = 2;
        System.out.println(insertX(st, x));
    }
}
