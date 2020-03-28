package c2.day10.Lambda;

public class demoLambda {
    public static void showlog(int a ,Message message){//接口作为类型
        if (a==1){
            System.out.println(message.builderMessage());
        }
    }

    public static void main(String[] args) {
        String msg1="Hello";
        String msg2="World";
        String msg3="java";
        showlog(1,()->{//当满足条件时才执行return
            return msg1+msg2+msg3;
        });
    }
}
