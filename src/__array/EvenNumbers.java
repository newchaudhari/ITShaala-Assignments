package __array;

public class EvenNumbers {
    public static void main(String[] args) {
        int[] array1={23,95,100,37,76,65,8765,670};
        for (int index = 0; index < array1.length; index++) {
            if (array1[index]%2!=0)
                System.out.print(array1[index]+" ");

        }

    }
}
