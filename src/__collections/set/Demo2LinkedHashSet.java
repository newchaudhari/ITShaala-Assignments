package __collections.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class Demo2LinkedHashSet {
    public static void main(String[] args) {
        Set set=new LinkedHashSet();
        set.add(100);
        set.add(200);
        set.add(300);
        set.add(400);
        set.add(500);
        set.add(100);
        set.add("abc");
        set.add(null);
        System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.stream());
    }
}
