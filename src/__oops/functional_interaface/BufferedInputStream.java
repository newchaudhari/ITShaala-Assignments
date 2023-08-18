package __oops.functional_interaface;

public class BufferedInputStream implements InputStreamOpener
{

    @Override
    public String open(String str) {
        System.out.println(str);
        return str;
    }

    public static void main(String[] args) {
        InputStreamOpener inputStreamOpener=new BufferedInputStream();
        inputStreamOpener.open("Buffered Input Stream");
    }

}
