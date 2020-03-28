package c2.day10.Lambda.Function;

import java.util.function.Function;

/*
 * Function中的andthen方法用来组合操作
 * 将String类型的133转换为Integer类型，把转换后的结果加上10
 * 把增加之后的Integer转换为String类型
 *
 *
 * */
public class demoFunction_test3 {
    public static Integer show(String s, Function<String, String> fun1,
                           Function<String, Integer> fun2, Function<Integer, Integer> fun3) {
        Integer apply = fun1.andThen(fun2).andThen(fun3).apply(s);
        return apply;
    }

    public static void main(String[] args) {
        String ss = "赵丽颖，20";
        int i=show(ss, (String s1) -> {
            return s1.split("，")[1];
        }, (String s2) -> {
            return Integer.parseInt(s2)+100;
        }, (Integer s3) -> {
            return s3+100;
        });
        System.out.println(i);
    }
}
