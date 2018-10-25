package BasicClass.DateCalendarTime;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest {
    public static void main(String[] args){
        Calendar calendar1 = Calendar.getInstance();//单例化
        Date date = calendar1.getTime();

        System.out.println(calendar1.getTime());
        System.out.println(calendar1.get(Calendar.YEAR));
        System.out.println(calendar1.get(Calendar.MONTH));
        System.out.println(calendar1.get(Calendar.DATE));
        System.out.println(calendar1.get(Calendar.HOUR));
        System.out.println(calendar1.get(Calendar.MINUTE));

        calendar1.set(2017,Calendar.DECEMBER,21,23,12,45);//
        System.out.println(calendar1.getTime());


        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date);
    }

}
