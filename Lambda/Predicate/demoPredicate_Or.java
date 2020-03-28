package c2.day10.Lambda.Predicate;

import java.util.function.Predicate;

/*
* 参数传递一个String类型的字符串
* 传递一个Predicate接口，泛型使用String
* 使用Predicate中的方法test对字符串精选判断，并把判断的结果返回
* or使用
* */
public class demoPredicate_Or {
    public static boolean checeString(String name, Predicate<String> pre, Predicate<String> pre2) {
//        return pre.test(name)||pre2.test(name);
        return pre.or(pre2).test(name);
    }

    public static void main(String[] args) {
        String name = "abcdef";
        boolean b =checeString(name,(pre)->{
            return name.length()>5;
        },(pre2)->{
          return name.contains("g");
        });
        System.out.println(b);
    }
}