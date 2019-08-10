package Lambda.Interface;

/**
 * @Author
 * @Date 2019/7/30 9:51
 **/
public class myClass implements myInterface1,myInterface2{
    public static void main(String[] args) {
        myClass m = new myClass();
        m.myMethod();
    }

    @Override
    public void myMethod() {
        myInterface2.super.myMethod();
    }
}
