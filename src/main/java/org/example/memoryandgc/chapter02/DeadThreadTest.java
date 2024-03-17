package org.example.memoryandgc.chapter02;

/**
 * @author jason
 * @description
 * @create 2024/3/17 17:32
 **/
public class DeadThreadTest {
    public static void main(String[] args) {
        Runnable r = () -> {
            System.out.println(Thread.currentThread().getName() + "開始");
            DeadThread deadThread = new DeadThread();
            System.out.println(Thread.currentThread().getName() + "結束");
        };

        Thread t1 = new Thread(r, "線程1");
        Thread t2 = new Thread(r, "線程2");
        t1.start();
        t2.start();
    }
}

//初始化時會同步加鎖
class DeadThread {
    static {
        if(true) {
            System.out.println(Thread.currentThread().getName() + "初始化當前類");
            while (true) { //模擬佔有鎖

            }
        }
    }
}
