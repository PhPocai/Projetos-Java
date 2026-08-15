import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class App {
    public static void main(String[] args) {

        //Padrao de fomatação de Data conforme ISO 8601
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        Date d02 = Date.from(Instant.parse("2018-06-25T15:00:07Z"));
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(sdf.format(d02));
        System.out.println(ldt);
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
        System.out.println(sdf.format(d02));

        //Somando unidade de tempo
        LocalDate d01 = LocalDate.parse("2026-08-03");
        LocalDate LastMonth = d01.minusMonths(1);
        System.out.println(d01);
        System.out.println(LastMonth);

        Date d03 = Date.from(Instant.now());
        Calendar cal = Calendar.getInstance();
        cal.setTime(d03);
        cal.add(Calendar.HOUR_OF_DAY,4);
        System.out.println(d03);

    }
}
