import java.sql.Date;
import java.sql.Time;

public class TypeCast {
    public static void main(String[] args) {
        String str="2015-03-31";
        Date date=Date.valueOf(str);//converting string into sql date
        System.out.println(date);
        String string="16:30:54";
        Time time=Time.valueOf(string);
        System.out.println(time);
    }
}
