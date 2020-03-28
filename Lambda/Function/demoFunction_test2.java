package c2.day10.Lambda.Function;

import java.util.function.Function;
/*
* Function中的andthen方法用来组合操作
* 将String类型的133转换为Integer类型，把转换后的结果加上10
* 把增加之后的Integer转换为String类型
*
*
* */
public class demoFunction_test2 {
    public static void show(String s,
    Function<String,Integer>fun1,Function<Integer,String>fun2){
        String apply = fun1.andThen(fun2).apply(s);
//        fun1先调用apply方法，把字符转换为Integer
//        fun2再调用appay方法，把Integer转换为字符串
        System.out.println(apply);

    }

    public static void main(String[] args) {
//        定义字符串
        String ss="133";
//        调用show方法，传递字符和两个lambda表达式
       /* show(ss,(String str)->{
            return Integer.parseInt(ss)+10;
        },(Integer integer)->{
            return integer+" ";
        });*/
        show(ss,(String str)->
                Integer.parseInt(ss)+10,(Integer integer)-> integer+" ");
    }
}
