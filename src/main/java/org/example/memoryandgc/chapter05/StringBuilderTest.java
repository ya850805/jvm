package org.example.memoryandgc.chapter05;

/**
 * @author jason
 * @description
 * @create 2024/3/28 17:28
 *
 *  面試題：
 *  方法中定義的局部變量是否線程安全？
 *
 *      何為線程安全？
 *          如果只有一個線程可以操作此數據，則必是線程安全的。
 *          如果有多個線程操作此數據，則此數據是共享數據。如果不考慮同步機制的話，會存在線程安全問題。
 **/
public class StringBuilderTest {

    //s1的聲明方式是線程安全的(只在方法內部使用，線程的棧幀互相隔離)
    public static void method1() {
        //StringBuilder線程不安全
        StringBuilder s1 = new StringBuilder();
        s1.append("a");
        s1.append("b");
    }

    //sBuilder的操作過程，是線程不安全的(作為參數傳遞過來，可能被其他線程操作)
    public static void method2(StringBuilder sBuilder) {
        sBuilder.append("a");
        sBuilder.append("b");
    }

    //s1的操作是線程不安全的(有返回值，可能被其他線程操作)
    public static StringBuilder method3() {
        StringBuilder s1 = new StringBuilder();
        s1.append("a");
        s1.append("b");
        return s1;
    }

    //s1的操作是線程安全的(s1自己滅亡了，最後返回的是一個s1.toString的一個新對象)
    public static String method4() {
        StringBuilder s1 = new StringBuilder();
        s1.append("a");
        s1.append("b");
        return s1.toString();
    }

    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();

        //多個線程操作同一個資源，線程不安全
        new Thread(() -> {
            s.append("a");
            s.append("b");
        }).start();
        method2(s);
    }
}
