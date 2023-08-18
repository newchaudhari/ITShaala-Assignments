package __collections.queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Demo1 {
    public static void main(String[] args) {
        Queue queue=new LinkedList();
        queue.add(12);
        queue.add(15);
        queue.add(12);
        queue.add(138);
        queue.add(5);
        System.out.println(queue);

    }
}
