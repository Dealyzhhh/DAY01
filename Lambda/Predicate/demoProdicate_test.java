package c2.day10.Lambda.Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class demoProdicate_test {
    public static ArrayList<String> show(String[] arr, Predicate<String> pre,Predicate<String> pre2){
        ArrayList<String> arr1=new ArrayList<>();
        for (String s : arr) {
            boolean b = pre.and(pre2).test(s);
            if (b==true){
                arr1.add(s);
            }
        }
        return arr1;
    }

    public static void main(String[] args) {
        String[] arr={"迪丽热巴，女","古力娜扎，女","马儿扎哈，男","赵丽颖，女"};
        ArrayList<String> list= show(arr,(pre)->{
            return  pre.split("，")[0].length()==4;

        },(pre2)->{
            return pre2.split("，")[1].equals("女");
        });
        for (String s : list) {
            System.out.println(s);
        }
    }
}
