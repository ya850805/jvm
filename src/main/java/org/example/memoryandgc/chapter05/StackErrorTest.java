package org.example.memoryandgc.chapter05;

/**
 * @author jason
 * @description
 * @create 2024/3/22 15:24
 *
 *  演示棧中的異常: StackOverflowError
 **/
public class StackErrorTest {
    private static int count = 1;

    public static void main(String[] args) {
        System.out.println(count);
        count++;
        main(args);
    }
}
