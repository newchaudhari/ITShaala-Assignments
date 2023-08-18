package __array;

public class CopyArray {
    public static void main(String[] args) {
        int[] oldArray={15,98,56,43,29,83,49};
        int[] newArray=new int[oldArray.length];
        for (int index = 0; index < oldArray.length; index++) {
            newArray[index]=oldArray[index];
        }
        System.out.println("Printing old array");
        for (int integer:oldArray) {
            System.out.print(integer+" ");
        }
        System.out.println();
        System.out.println("Printing copy array");
        for (int integer:newArray) {
            System.out.print(integer+" ");
        }
    }
}
