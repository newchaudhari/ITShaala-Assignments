package __collections.list;

import java.util.LinkedList;
import java.util.List;

public class Demo2LinkedList {
    public static void main(String[] args) {
        List list=new LinkedList();
        list.add("navin");
        list.add("chaudhari");
        list.add("navin");
        list.add(1000);
        list.add(10.63);
        list.add('a');
        list.add(true);
        list.add(null);
        list.add(null);
        list.add(null);
        System.out.println(list.size());
        System.out.println(list.indexOf("navin"));
        System.out.println(list.lastIndexOf("navin"));
        System.out.println(list.get(5));
        LinkedList list1=new LinkedList<>();
        list1.add("navin");
        list1.add("chaudhari");
        System.out.println(list1.getFirst());
        System.out.println(list1.getLast());
        System.out.println(list);

    }
}
