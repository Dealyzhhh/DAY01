package c2.day10.Lambda;

import java.util.Arrays;
import java.util.Comparator;
/*
* 使用 Comparator接口
* */
public class demoCompaeter {
    public static Comparator<String> getComparator(){
   /*     return new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        };*/

      /*  return ((String o1,String O2)->{
            return o1.length()-o2.length();
        });
        */
//      按照字母降序
        return (( o1, o2)-> o1.length()-o2.length());


    }

    public static void main(String[] args) {
        String[] arr={"aaa","bbbb","ddd","cccccc"};
        System.out.println(Arrays.toString(arr));
        System.out.println("*******************");
        Arrays.sort(arr,getComparator());
        System.out.println(Arrays.toString(arr));
    }
}
