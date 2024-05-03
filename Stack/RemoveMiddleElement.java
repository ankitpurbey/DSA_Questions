package Stack;

import java.util.Stack;

public class RemoveMiddleElement {
    public void remove(Stack<Integer>s,int sizeOfStack){
        int mid = (sizeOfStack+1)/2;
        s.remove(mid-1);
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        int sizeOfStack = s;
        
    }
    
}
