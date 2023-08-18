package __collections.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo2 {
    public static void main(String[] args) {
        Map map=new LinkedHashMap();
        map.put(1,"abc");
        map.put(2,"xyz");
        map.put(3,"mno");
        map.put(5,"pqr");
        map.put(0,"stv");
        System.out.println(map);
    }
}
