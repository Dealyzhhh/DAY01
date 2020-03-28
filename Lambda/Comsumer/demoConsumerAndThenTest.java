package c2.day10.Lambda.Comsumer;

import java.util.function.Consumer;

/*
* Consumer
* Consumer<String> con1
* Consumer<String> con2
* 链接两个Consumer接口，再进行消费
* con1.andThen(con2).accept(name)
* 迪丽热巴，女","古力娜扎，女","马儿扎哈，男"转换为
* 姓名：迪丽热巴，性别：女。
姓名：古力娜扎，性别：女。
姓名：马儿扎哈，性别：男。

* */
public class demoConsumerAndThenTest {
    public static void method(String[] arr, Consumer<String> con1,Consumer<String> con2){
        for (String message : arr) {
            con1.andThen(con2).accept(message);
        }
    }

    public static void main(String[] args) {
        String[] arr={"迪丽热巴，女","古力娜扎，女","马儿扎哈，男"};

  method(arr,
          (message)->{
              String[] split = message.split("，");
              System.out.print("姓名："+split[0]);
          },
          (message)->{
              String[] split = message.split("，");
              System.out.println("，性别："+split[1]+"。");
          });
    }
}
