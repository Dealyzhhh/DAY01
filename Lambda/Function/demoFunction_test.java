package c2.day10.Lambda.Function;
/*
* Function的方法apply转换为不同类型
*
* */
import java.util.function.Function;

public class demoFunction_test {
    public static void change(String s, Function<String,Integer> function){
      /*  Integer integer = function.apply(s);
        System.out.println(integer);*/
        System.out.println(function.apply(s));
    }

    public static void main(String[] args) {
        String s="12344";
        change(s,(String str)->{
            int i = Integer.parseInt(s);
            return i;
        });

    }

}
