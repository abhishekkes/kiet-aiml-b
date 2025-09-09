package Unit3;

import java.util.Stack;
import java.util.Vector;

public class Vector1 {
    public static void main(String[] args) {
        Stack<String> stk=new Stack<>();
        stk.push("first");
        stk.push("second");
        System.out.println(stk.pop());
        System.out.println(stk.peek());
        System.out.println(stk.size());
        stk.clear();
        System.out.println(stk.isEmpty());
    }
}
