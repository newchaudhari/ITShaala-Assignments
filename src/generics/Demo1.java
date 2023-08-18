package generics;

public class Demo1 {
    public static void main(String[] args) {
        Addition<Integer> integerAddition= Integer::sum;
        System.out.println("sum of integer is: "+integerAddition.add(35,98));

        Addition<Double> doubleAddition= Double::sum;
        System.out.println("sum of double is: "+doubleAddition.add(73.6,98.86));

        Addition<Float> floatAddition= Float::sum;
        System.out.println("sum of float is: "+floatAddition.add(78.69f,2.9f));

        Addition<Character> characterAddition= (a,b)-> (char) (a+b);
        System.out.println("sum of character is: "+characterAddition.add('b','a'));

    }
}
