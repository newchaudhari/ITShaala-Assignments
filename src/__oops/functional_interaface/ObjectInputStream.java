package __oops.functional_interaface;

public class ObjectInputStream implements InputStreamOpener{
    @Override
    public String open(String str) {
        System.out.println(str);
        return str;
    }
    public static void main(String[] args) {
        InputStreamOpener inputStreamOpener=new ObjectInputStream();
        inputStreamOpener.open("Object Input Stream");
    }
}
