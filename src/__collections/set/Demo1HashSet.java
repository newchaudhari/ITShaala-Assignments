package __collections.set;

import java.util.HashSet;

public class Demo1HashSet {
    public static void main(String[] args) {
        HashSet hashSet=new HashSet<>();
        hashSet.add(100);
        hashSet.add(100);
        hashSet.add(200);
        hashSet.add(300);
        hashSet.add(400);
        hashSet.add("Navin");
        hashSet.add("Chaudhari");
        hashSet.add(null);
        System.out.println(hashSet);
        System.out.println(hashSet.size());
        hashSet.clear();
        System.out.println(hashSet);

    }
}
