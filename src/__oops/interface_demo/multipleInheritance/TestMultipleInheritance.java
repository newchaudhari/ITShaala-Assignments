package __oops.interface_demo.multipleInheritance;

public class TestMultipleInheritance implements I1, I2 {
    @Override
    public int integer(int number) {
        return number * number;
    }

    @Override
    public void Name(String name) {
        System.out.println(name);
    }

    public static void main(String[] args) {
        I1 integer = new TestMultipleInheritance();
        System.out.println(integer.integer(12));

        I2 name = new TestMultipleInheritance();
        name.Name("Navin Chaudhari");

        TestMultipleInheritance test = new TestMultipleInheritance();
        System.out.println(test.integer(11));
        test.Name("Anil Chaudhari");


    }
}
