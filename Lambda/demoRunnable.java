package c2.day10.Lambda;

public class demoRunnable {
//    定义一个方法startThread，方法的参数使用函数式接口Runnable
    public static void startThread(Runnable runnable){
        new Thread(runnable).start();
    }

    public static void main(String[] args) {
        startThread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"线程启动了");

            }
        });

        startThread(()->{
            System.out.println(Thread.currentThread().getName()+"线程启动了");
        });

        startThread(()-> System.out.println(Thread.currentThread().getName()+"线程启动了"));
    }
}
