package _3_operators;

public class Assignment10 {
    public static void main(String[] args) {
        //Suppose the values of variables 'a' and 'b' are 6 and 8 respectively, write two programs to swap the values of the two variables.
        //
        //1 - first program by using a third variable
        //
        //2 - second program without using any third variable
        //
        //( Swapping means interchanging the values of the two variables
        // E.g.- If entered value of x is 5 and y is 10 then after swapping the value of x and y should become 10 and 5 respectively.)
        int a=6;
        int b=8;
        int thirdVariable=a;
        a=b;
        b=thirdVariable;
        System.out.println("a "+a);
        System.out.println("b "+b);

        // without using third variable
        int x=6;
        int y=8;

        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("x "+x);
        System.out.println("y "+y);


    }
}
