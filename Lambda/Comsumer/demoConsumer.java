package c2.day10.Lambda.Comsumer;

import java.util.function.Consumer;
/*
* Consumer接口消费字符串姓名
* */
public class demoConsumer {
    public static void method(String name, Consumer<String> con){
        con.accept(name);
    }

    public static void main(String[] args) {
        method("赵丽颖",(name)->{
//            对字符串进行消费
//            消费方式，直接输出字符串
            System.out.println(name);
//            消费方式，把字符串精选反转输出
            String string = new StringBuffer(name).reverse().toString();
            System.out.println(string);
        });
    }
}
