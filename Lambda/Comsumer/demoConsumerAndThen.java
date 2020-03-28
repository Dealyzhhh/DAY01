package c2.day10.Lambda.Comsumer;

import java.util.function.Consumer;

/*
* Consumer
* Consumer<String> con1
* Consumer<String> con2
* 链接两个Consumer接口，再进行消费
* con1.andThen(con2).accept(name)
* */
public class demoConsumerAndThen {
    public static void method(String name, Consumer<String> con1,Consumer<String> con2){
       /* con1.accept(name);
        con2.accept(name);*/
       con1.andThen(con2).accept(name);
    }

    public static void main(String[] args) {
  method("Hello",
          (t)->{
              System.out.println(t.toUpperCase());;
          },
          (t)->{
              System.out.println(t.toLowerCase());
          });
    }
}
