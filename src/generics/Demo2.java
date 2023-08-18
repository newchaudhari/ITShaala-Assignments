package generics;

public class Demo2<T> {
    T obj;

    public Demo2(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return this.obj;
    }

    public static void main(String[] args) {
       Demo2<Integer> obj1=new Demo2<Integer>(16);
        System.out.println(obj1.getObj());

        Demo2<String> obj2=new Demo2<String>("Navin Chaudhari");
        System.out.println(obj2.getObj());

    }
}
