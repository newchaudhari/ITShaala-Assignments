package __oops.functional_interaface;

public class inputStreamOpenerImpl {
    public static void main(String[] args) {
        InputStreamOpener bufferedInputStream=new InputStreamOpener() {
            @Override
            public String open(String str) {
                System.out.println(str);
                return str;
            }
        };
        InputStreamOpener objectInputStream=new InputStreamOpener() {
            @Override
            public String open(String str) {
                System.out.println(str);
                return str;
            }
        };
        InputStreamOpener dataInputStream=new InputStreamOpener() {
            @Override
            public String open(String str) {
                System.out.println(str);
                return str;
            }
        };
        bufferedInputStream.open("Buffered Input Stream");
        objectInputStream.open("Object Input Stream");
        dataInputStream.open("Data Input Stream");

    }

}
