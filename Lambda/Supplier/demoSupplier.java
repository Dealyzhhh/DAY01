package c2.day10.Lambda.Supplier;

import com.sun.security.jgss.GSSUtil;

import java.util.function.Supplier;

public class demoSupplier {
    public static String getSting(Supplier<String> supplier){
        return supplier.get();
    }

    public static void main(String[] args) {
        String S=getSting(()->{
            return "胡歌";
        });
        System.out.println(S);


        String S2=getSting(()-> "胡歌");
        System.out.println(S2);
    }
}
