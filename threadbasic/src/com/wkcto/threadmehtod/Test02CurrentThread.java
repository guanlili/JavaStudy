package com.wkcto.threadmehtod;

/**
 * @version 1.0
 * @auther guanhongli
 * @date 2022/7/11 7:38 PM
 */
public class Test02CurrentThread {
    public static void main(String[] args) throws InterruptedException {
        SubThread2 t2 =new SubThread2();
        t2.setName("t2"); //设置线程的名称
        t2.start();

        Thread.sleep(500);// main线程睡眠500ms
        //Thread(Runnable)构造方法形参是Runnable接口，调用时传递的实参是结构的实现类对象
        Thread t3 = new Thread(t2);
        t3.start();

    }
}
