package __collections.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo1 {
    public static void main(String[] args) {
        Map map=new HashMap<>();
        map.put(13,"navin");
        map.put(123,"vinit");
        map.put(32,"anil");
        map.put(89,"bharati");
        map.put(1,"chaudhari");
        map.put("navin","chaudhari");
        map.put(null,"abc");
        System.out.println("only keys: "+map.keySet());
        System.out.println("only values: "+map.values());
        System.out.println("all values: "+map.entrySet());
        System.out.println("size: "+map.size());
        map.entrySet().forEach(System.out::println);

    }
}
