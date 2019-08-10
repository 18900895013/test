package Lambda.JodaTime;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;

import javax.xml.crypto.Data;

/**
 * @Author
 * @Date 2019/7/31 13:48
 **/
public class jodaTimeTest01 {
    public static void main(String[] args) {
        DateTime dateTime = new DateTime();
        System.out.println(dateTime.toString("yyyy-MM-dd HH:mm:ss"));
        System.out.println("------------");

        DateTime t1 = dateTime.withDayOfMonth(1);
        System.out.println(t1.toString("yyyy-MM-dd"));
        System.out.println("--------------");

        LocalDate localDate = new LocalDate();
        System.out.println(localDate);
        System.out.println("-------------");

        localDate = localDate.plusMonths(3).dayOfMonth().withMaximumValue();
        System.out.println(localDate);
        System.out.println("-------------");

        //计算两年前的第三个月最后一天的日期
        DateTime dateTime1 = new DateTime();
        DateTime dateTime2 = dateTime1.minusYears(2).monthOfYear().setCopy(3).dayOfMonth().withMaximumValue();
        System.out.println(dateTime2.toString("yyyy-MM-dd"));
    }
}
