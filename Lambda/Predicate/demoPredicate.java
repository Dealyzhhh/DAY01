package c2.day10.Lambda.Predicate;

import java.util.function.Predicate;

/*
* 参数传递一个String类型的字符串
* 传递一个Predicate接口，泛型使用String
* 使用Predicate中的方法test对字符串精选判断，并把判断的结果返回
* */
public class demoPredicate {
    public static boolean checeString(String name, Predicate<String> pre){
        return pre.test(name);
    }

    public static void main(String[] args) {
        String name="abcdefg";
     /*   boolean b=checeString(name,(String p)->{
            return name.length()>5;
        });
        System.out.println(b);
    }*/
    boolean b=checeString(name,(p)->name.length()>5);
        System.out.println(b);
}
}
