package c2.day10.Lambda.Supplier;

import java.util.function.Supplier;

public class demoSupplierInterger {
    public static Integer getMax(Supplier<Integer> supplier){
        return supplier.get();
    }

    public static void main(String[] args) {
        int[] arr={100,200,345,6777,22323,};
            int max1=getMax(()->{
               int max=arr[0];
                for (int i : arr) {
                    if (i>max){
                        max=i;
                    }
                }
                return max;
            });
        System.out.println("获取的最大的书是："+max1);
    }
}
