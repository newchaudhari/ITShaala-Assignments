package __oops.functional_interaface;

public class InputStreamOpenerByLambda {
    public static void main(String[] args) {
        InputStreamOpener bufferedInputStream=(str) -> {
            System.out.println(str);
            return str;
        };
        InputStreamOpener dataInputStream=(str) -> {
            System.out.println(str);
            return str;
        };
        InputStreamOpener objectInputStream=(str) -> {
            System.out.println(str);
            return str;
        };
        bufferedInputStream.open("Buffered input Stream");
        objectInputStream.open("Object input Stream");
        dataInputStream.open("Data input Stream");
    }
}
