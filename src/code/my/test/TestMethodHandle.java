package code.my.test;


import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

/**
 * 方法句柄测试
 */
public class TestMethodHandle {

    static class Qyf{
        public void println(String s){
            System.out.println(s);
        }
    }

    public static void main(String[] args) throws Throwable{

        getPrintlnMethodHandle(System.out).invokeExact("qyf");
        getPrintlnMethodHandle(new Qyf()).invokeExact("123");

    }

    private static MethodHandle getPrintlnMethodHandle(Object reveiver)throws Throwable{

        MethodType methodType = MethodType.methodType(void.class, String.class);

        return MethodHandles.lookup().findVirtual(reveiver.getClass(), "println", methodType).bindTo(reveiver);
    }
}





