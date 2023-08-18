package __array;

public class ReverseNumber {
    public static void main(String[] args) {
        int[] array={15,98,56,43,29,83,49};
        int left=0;
        int right= array.length-1;
        while (left<right){
            int temp=array[left];
            array[left]=array[right];
            array[right]=temp;
            left++;
            right--;
        }
        for (int index:array) {
            System.out.print(index+" ");
        }
        
    }
}
