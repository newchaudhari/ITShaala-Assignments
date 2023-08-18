package __collections.list;

import java.util.ArrayList;

public class Demo1ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(13);
//        arrayList.add("navin");
//        arrayList.add("chaudhari");
        arrayList.add(null);
        arrayList.add(156);
//        arrayList.add(25.8);
//        arrayList.add('a');
//        arrayList.add(true);
        System.out.println(arrayList);
        arrayList.remove(null);
        System.out.println(arrayList.size());
        ArrayList arrayList1=new ArrayList<>();
        arrayList1.add(156);
        arrayList1.add(25.8);

        System.out.println(arrayList.contains("navin"));
        arrayList.removeAll(arrayList1);
        System.out.println(arrayList);
        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);
        arrayList.add(400);
        arrayList.add(500);
        System.out.println(arrayList);
        arrayList.removeIf((number)->number%2==0);
        System.out.println(arrayList);
    }
}
