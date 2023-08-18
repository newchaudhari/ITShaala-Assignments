package __blocks_NestedClass;

public class InstanceClass {

    int id;
    String name;
    int income;
    int expense;
    String remark;
    class bankA{

        void m1() {
            id=2;
            name="Navin Chaudhari";
            income=30000;
            expense=500;
            remark="Lunch";
            System.out.println("Id "+id);
            System.out.println("income "+income);
            System.out.println("expense "+expense);
            System.out.println("remark "+remark);
        }
    }
    class bankB{
        void m2() {
            id=1;
            name="Anil Chaudhari";
            income=60000;
            expense=1500;
            remark="Mess";
            System.out.println("Id "+id);
            System.out.println("income "+income);
            System.out.println("expense "+expense);
            System.out.println("remark "+remark);
        }
    }
}
