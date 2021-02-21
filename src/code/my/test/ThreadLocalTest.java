package code.my.test;

import java.text.SimpleDateFormat;

public class ThreadLocalTest {

    public static ThreadLocal<SimpleDateFormat> sdftl = new ThreadLocal<>() {
        @Override
        protected SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        }
    };
    public static ThreadLocal<SimpleDateFormat> sdftl2 = ThreadLocal.withInitial(() -> new SimpleDateFormat("yyyy-MM-dd"));

    public static void main(String[] args) {


    }
}




