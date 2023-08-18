package __methods_practice;

public class Demo {
    void student(){

    }

    int studentId(){
        return studentId();
    }

    String  studentName(){
        return studentName();
    }

    static String collageName(){

        return collageName();
    }

    public static void main(String[] args) {
        Demo.collageName();//calling static Method

        Demo d=new Demo();
        d.studentId();//calling instance method
        d.studentName();//calling instance method

    }

}
