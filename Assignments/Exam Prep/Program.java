import java.text.SimpleDateFormat;
import java.util.*;

public class Program {
    public static void main(String[] args) {
        
        SimpleDateFormat s = new SimpleDateFormat("dd/MM/YYYY");
        Date d = new Date();
        System.out.println(s.format(d));

        s = new SimpleDateFormat("MM/dd/YYYY");
        System.out.println(s.format(d));

        s = new SimpleDateFormat("YYYY/dd/MM");
        System.out.println(s.format(d));

        s = new SimpleDateFormat("hh:mm:ss a");
        System.out.println(s.format(d));

        s = new SimpleDateFormat("hh:mm:ss a E");
        System.out.println(s.format(d));

        s = new SimpleDateFormat("MM/dd/YYYY hh:mm:ss a E");
        System.out.println(s.format(d));

        // LocalDateTime dt = LocalDateTime.now();
        // System.out.println(dt);

        //  DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/YYYY");
    }
    
}
