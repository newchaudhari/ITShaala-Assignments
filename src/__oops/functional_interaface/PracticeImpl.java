package __oops.functional_interaface;

import java.util.Scanner;

public class PracticeImpl implements Practice{
    int lenght;
    int breadth;

    @Override
    public int number(int length, int breadth) {
        this.lenght=length;
        this.breadth=breadth;
        return length*breadth;
    }

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Length ");
       int length= scanner.nextInt();
        System.out.print("Breadth ");
        int breadth= scanner.nextInt();
        Practice practice=new PracticeImpl();
        System.out.println("Area "+practice.number(length,breadth));




    }
}
