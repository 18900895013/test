package Lambda.Optional;

import java.util.List;

/**
 * @Author
 * @Date 2019/7/30 9:15
 **/
public class Company {
    private List<Employee> employeeList;
    private String name;

    public Company(String name) {
        this.name = name;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
