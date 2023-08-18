package __oops.inheritance.case3andcase4;

public class TestParentChild {

    public static void main(String[] args) {
        Parent parent=new Child();

        //case 1: only present in parent class
        System.out.println(parent.a);//access parent class members

        //case 2: only present in child class
        //We get CTE
//        System.out.println(parent.b);

        //case 3: present in both parent and child class
        System.out.println(parent.c);//access variables from parent class
        parent.m1();//access methods from child class





    }
}
