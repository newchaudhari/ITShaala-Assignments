package __array;

public class AddArray {
    public static void main(String[] args) {
        int[] array={10,20,30,40,50};
        int sum=0;
        for (int integer:array) {
            sum+=integer;
        }
        System.out.println("Sum of an Array "+sum);

    }
}
