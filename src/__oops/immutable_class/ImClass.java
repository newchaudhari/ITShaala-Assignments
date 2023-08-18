package __oops.immutable_class;

final class ImClass {
    final private int id;
    final private String name;

    ImClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        ImClass c1=new ImClass(5,"navin");
        System.out.println(c1.id);
        System.out.println(c1.name);
        ImClass c2=new ImClass(6,"anil");
        System.out.println(c2.id);
        System.out.println(c2.name);

    }
}
