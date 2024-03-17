package org.example.memoryandgc.chapter02;

/**
 * @author jason
 * @description
 * @create 2024/3/17 17:22
 **/
public class ParentInitFirstTest {
    static class Father {
        public static int A = 1;
        static {
            A = 2;
        }
    }

    static class Son extends Father {
        public static int B = A;
    }

    public static void main(String[] args) {
        //加載Father類 -> 加載Son類
        System.out.println(Son.B);
    }
}
