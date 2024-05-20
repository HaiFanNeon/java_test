package test07;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;
import java.util.SimpleTimeZone;

public class data {
    public static void main(String[] args) {
        Date date = new Date();
//        System.out.println(date);
//        date.setTime(123456);
//        System.out.println(date.getTime());

//        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E");
//        System.out.println(sd);
////        System.out.println(sd.format(date));
//
//        Calendar cl = Calendar.getInstance();
//        cl.add(1, 2000);
//        System.out.println(cl.getTime());

        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(availableZoneIds);
        System.out.println(ZoneId.systemDefault());
        System.out.println(ZoneId.of("Asia/Shanghai"));

        System.out.println(Instant.now().atZone(ZoneId.systemDefault()));

//        Instant a1 = Instant.ofEpochMilli(date);
//        System.out.println(a1);
//        System.out.println(ZonedDateTime.now());
        LocalDateTime localDateTime = LocalDateTime.of(2023, 1, 1, 1, 2, 3);

        // 使用系统默认时区创建一个ZonedDateTime对象

        ZonedDateTime z = ZonedDateTime.ofInstant(Instant.now(), ZoneId.systemDefault());

        // 打印ZonedDateTime对象
        System.out.println(z.plusYears(1234));

        ZonedDateTime time = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));
        DateTimeFormatter dt = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss EE a");
        System.out.println(dt.format(time));

        LocalDate nowDate = LocalDate.now();
        System.out.println(nowDate);

//        nowDate = LocalDate.of(2023,1,1);
        System.out.println(nowDate);

        int year = nowDate.getYear();
        System.out.println(year);

        Month m = nowDate.getMonth();
        System.out.println(m);
        System.out.println(m.getValue());

        int mo = nowDate.getMonthValue();
        System.out.println(mo);

        int day = nowDate.getDayOfMonth();
        System.out.println(day);

        int dy = nowDate.getDayOfYear();
        System.out.println(dy);

        DayOfWeek week = nowDate.getDayOfWeek();
        System.out.println(week.getValue());

        MonthDay bir = MonthDay.of(nowDate.getMonthValue(), nowDate.getDayOfMonth());
        MonthDay n = MonthDay.from(nowDate);
        System.out.println(bir.equals(n));

        LocalTime time1 = LocalTime.now();
        int h = time1.getHour();
        System.out.println(h);

        LocalDate birth = LocalDate.of(2003,05,19);
        System.out.println(birth);

        Period per = Period.between(birth, LocalDate.now());
        System.out.println(per);

        System.out.println(per.getDays());

        String a = Integer.toBinaryString(3);
        System.out.println(a);

    }
}
