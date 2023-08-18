package __collections.list;

import java.util.Stack;

public class Demo3StackList {
    public static void main(String[] args) {
        Stack stack=new Stack();
        stack.push(100);//add element inside the stack in Last in First out Order
        stack.push(200);
        stack.push(300);
        stack.push(400);
        stack.push(500);
        System.out.println(stack);
        System.out.println(stack.pop());//remove top most element
        System.out.println(stack.peek());//checks top element without removing it
        System.out.println(stack);
        System.out.println(stack.isEmpty());
        System.out.println(stack.search(300));
    }
}
