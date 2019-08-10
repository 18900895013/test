package Lambda.Optional;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * @Author
 * @Date 2019/7/30 9:05
 **/
public class OptionalTest01 {
    public static void main(String[] args) {
        Optional<String> optional = Optional.ofNullable("hello");
        optional.ifPresent(System.out::println);
        System.out.println("----------");
        System.out.println(optional.orElse("world"));
        System.out.println("-----------");
        System.out.println(optional.orElseGet(()->"nihao"));
        /******************************************************/
        Employee employee1 = new Employee("zhangsan");
        Employee employee2 = new Employee("lisi");
        Employee employee3 = new Employee("wangwu");
        Company company = new Company("company1");

        List<Employee> employees = company.getEmployeeList();
                company.setEmployeeList(employees);
                Optional<Company> o = Optional.ofNullable(company);
        System.out.println(o.map(item->item.getEmployeeList()).orElse(Collections.emptyList()));
    }
}
