package __oops.inheritance.a2;

import __oops.inheritance.a1.Parent;

class Child extends Parent {
    public static void main(String[] args) {
        Parent p=new Parent();
        System.out.println(p.a);
        p.m1();
    }

}
