package BasicClass.DateCalendarTime;

import java.awt.*;
import java.awt.image.ColorConvertOp;
import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.ZoneId;

public class NewDatePackageTest {
    public static void main(String[] args) {
        //----------以下是Colock的用法--------
        //获取当前Colock
        Clock clock = Clock.systemUTC();
        //通过Clock获取当前时刻
        System.out.println("当前时刻为:" + clock.instant());
        //获取Clock对应的毫秒数,其值等于System.currentTimeMillis()
        System.out.println(clock.millis());
        System.out.println(System.currentTimeMillis());

        //------------以下是Duriation类的用法------------------
        Duration duration = Duration.ofSeconds(6000);
        System.out.println("6000秒相当于" + duration.toMinutes() + "分");
        System.out.println("6000秒相当于" + duration.toHours() + "时");
        System.out.println("6000秒相当于" + duration.toDays() + "天");
        Clock clock2 = Clock.offset(clock, duration);
        System.out.println("当前时刻加上6000S为:" + clock2.instant());

        //--------------以下是Instant用法----------------------
        Instant instant = Instant.now();
        System.out.println(instant);
        //instant添加6000s,返回新的instant
        Instant instant2 = instant.plusSeconds(6000);
        System.out.println(instant2);
        //根据字符串解析Instant对象
        Instant instant3 = Instant.parse("2014-02-23T10:12:35.3421Z");
        System.out.println(instant3);
        System.out.println(instant3.toString());


    }
}
