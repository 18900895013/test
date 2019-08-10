package Lambda.Stream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @Author
 * @Date 2019/7/30 10:43
 **/
public class StreamTest02 {
    public static void main(String[] args) {
        IntStream.of(new int[]{1,2,3,4,5}).forEach(System.out::println);
        System.out.println("-----------");
        IntStream.range(3,8).forEach(System.out::println);
        System.out.println("--------------");
        IntStream.rangeClosed(3,8).forEach(System.out::println);
    }
}
