package Lambda.Stream;

import java.util.Arrays;
import java.util.List;

/**
 * @Author
 * @Date 2019/7/30 13:47
 **/
public class StreamTest03 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        System.out.println(list.stream().map(item->item*2).reduce(0,Integer::sum));
    }
}
