package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author
 * @Date 2019/7/29 9:51
 **/
public class Test01 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
        List<String>  list1 = Arrays.asList("h","e","l","l","o");
        List<String>  list2 = new ArrayList<>();
        list.forEach(item-> System.out.println(item));
        System.out.println("=====================");
        list.forEach(System.out::println);
        System.out.println("=====================");
        list1.stream().map(item->item.toUpperCase()).forEach(item-> System.out.println(item));
        System.out.println("=====================");
        list1.stream().map(String::toUpperCase).forEach(System.out::println);
        System.out.println("=====================");
        list1.forEach(item->list2.add(item.toUpperCase()));
        list2.forEach(item-> System.out.println(item));
        int i =8;
        System.out.println(i>>2);
    }
}
