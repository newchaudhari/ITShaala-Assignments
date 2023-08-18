package __array;

public class CharArrayDemo1 {
    public static void main(String[] args) {
        char[] array = {'a', 'b', 'c', 'd', 'e', 'f', 'g','5'};

        //search character
        System.out.println("Character searching:");
        searchArray(array);
        System.out.println();

        //find digit
        System.out.println("Finding digit:");
        findDigit(array);
        System.out.println();

        //printing original array
        System.out.println("Printing original array:");
        printingArray(array);
        System.out.println();

        //making array reversed
        reverseArray(array);
        System.out.println("printing reverse array:");
        printingArray(array);
        System.out.println();

        //merged array
        System.out.println("printing merged array:");
        mergedArray();

    }

    public static void printingArray(char[] array) {
        for (char ch:array) {
            System.out.print(ch+" ");
        }
        System.out.println();
    }

    public static void reverseArray(char[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            char temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }

    public static void searchArray(char[] array) {
        char key = 'd';
        for (char ch : array) {
            if (ch == key) {
                System.out.println("Character found " + ch);
                break;
            }
        }
    }

    public static char[] mergedArray(){
        char[] array1={'N','a','v','i','n',' '};
        char[] array2={'C','h','a','u','d','h','a','r','i'};
        char[] mergedArray=new char[array1.length+array2.length];
        int indexOfMergedArray=0;
        for (int index = 0; index < array1.length && indexOfMergedArray<mergedArray.length; index++,indexOfMergedArray++) {
          mergedArray[indexOfMergedArray]=array1[index];
            }
        for (int index = 0; index < array2.length && indexOfMergedArray<mergedArray.length; index++,indexOfMergedArray++) {
          mergedArray[indexOfMergedArray]=array2[index];
            }

        for (char ch:mergedArray) {
            System.out.print(ch+" ");
        }
        System.out.println();
        return mergedArray;
        }
    public static void findDigit(char[] array){
        for (char ch:array) {
            if (ch>='0' && ch<='9'){
                System.out.println("Digit found "+ch);
                break;
            }
        }
    }
    }
