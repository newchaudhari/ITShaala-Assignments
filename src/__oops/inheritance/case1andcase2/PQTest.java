package __oops.inheritance.case1andcase2;

public class PQTest {

    public static void main(String[] args) {
        Q q=new Q();
        //case 1: only present in parent class
        System.out.println(q.a);//we can access only parent class

        //case 2: only present in child class
        System.out.println(q.b);//we will access child class members

        //case 3: present in both parent and child class
        System.out.println(q.c);//we will access child class members

        q.m1();
    }
}
