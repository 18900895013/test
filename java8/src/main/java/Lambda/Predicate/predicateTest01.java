package Lambda.Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @Author
 * @Date 2019/7/29 13:49
 **/
public class predicateTest01 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        conditionFilter(list,i->i%2==0);
        System.out.println("--------------------");
        conditionFilter(list,i->i%2!=0);
        System.out.println("--------------------");
        conditionFilter(list,i->i>5);
        System.out.println("--------------------");
        conditionFilter(list,i->i<3);
        System.out.println("--------------------");
        conditionFilter(list,i->true);
        System.out.println("--------------------");
        conditionFilter(list,i->false);
        System.out.println("--------------------");
    }
    public static void conditionFilter(List<Integer> list, Predicate<Integer> predicate){
        list.stream().filter(integer->predicate.test(integer)).forEach(System.out::println);
    }
}
