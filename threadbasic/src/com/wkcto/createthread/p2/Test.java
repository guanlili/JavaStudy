package com.wkcto.createthread.p2;

/**
 * @version 1.0
 * @auther guanhongli
 * @date 2022/7/11 2:46 PM
 * 线程运行结果的随机性
 */
public class Test {
    public static void main(String[] args) {
        MyThread2 thread2 = new MyThread2();
        thread2.start();
        for(int i=1;i<10;i++){
            System.out.println("main thread:"+i);
            int time= (int)(Math.random()*1000);
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
