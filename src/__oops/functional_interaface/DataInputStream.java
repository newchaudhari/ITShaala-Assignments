package __oops.functional_interaface;

import java.io.InputStream;

public class DataInputStream implements InputStreamOpener{
    @Override
    public String open(String str) {
        System.out.println(str);
        return str;
    }
    public static void main(String[] args) {
        InputStreamOpener inputStreamOpener = new DataInputStream();
        inputStreamOpener.open("Data Input Stream");
    }
}
