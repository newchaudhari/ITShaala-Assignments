package _9_string;

public class MergedStringArray {
        public static String[] mergeArrays(String[] array1, String[] array2) {
            int length1 = array1.length;
            int length2 = array2.length;
            int mergedLength = length1 + length2;

            String[] mergedArray = new String[mergedLength];

            System.arraycopy(array1, 0, mergedArray, 0, length1);
            System.arraycopy(array2, 0, mergedArray, length1, length2);

            return mergedArray;
        }

        public static void main(String[] args) {
            String[] array1 = {"Hello", "there"};
            String[] array2 = {"How", "are", "you?"};

            String[] mergedArray = mergeArrays(array1, array2);

            System.out.println("Merged Array:");
            for (String element : mergedArray) {
                System.out.print(element+" ");
            }

        }

    }

