package Lambda;

import java.util.function.Function;

/**
 * @Author
 * @Date 2019/7/29 10:30
 **/
public class FunctionTest01 {
    public static void main(String[] args) {
        FunctionTest01 f = new FunctionTest01();
        System.out.println(f.compute(1,value->{return 2*value;}));
        System.out.println(f.compute(2,value->5+value));
        System.out.println(f.compute(3,value->value*value));
        System.out.println(f.convert(5,value->value+"helloworld"));
        f.way(6,value->2*value,value->5+value,value->value*value);
        //compose
        System.out.println(f.compute1(7,value->value*value,value->value+1));
        //andThen
        System.out.println(f.compute2(7,value->value*value,value->value+1));
    }
    public int compute(int a, Function<Integer,Integer> function){
        int result = function.apply(a);
        return result;
    }
    public String convert(int a,Function<Integer,String> function){
        String result = function.apply(a);
        return  result;
    }
    public void way(int a,Function<Integer,Integer> function1,Function<Integer,Integer> function2,Function<Integer,Integer> function3){
        int result1 = function1.apply(a);
        int result2 = function2.apply(a);
        int result3 = function3.apply(a);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
    public int compute1(int a,Function<Integer,Integer> function,Function<Integer,Integer> function1){
        return function.compose(function1).apply(a);
    }
    public int compute2(int a,Function<Integer,Integer> function,Function<Integer,Integer> function1){
        return function.andThen(function1).apply(a);
    }
}
