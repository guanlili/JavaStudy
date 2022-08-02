package com.wkcto.threadmehtod;

/**
 * @version 1.0
 * @auther guanhongli
 * @date 2022/7/11 5:20 PM
 */
public class Test01CurrnetThread {
    public static void main(String[] args) {
        System.out.println("main方法中打印当前线程"+Thread.currentThread().getName());
        //创建子线程，调用SubThread1()构造方法，在main线程中调用构造方法，所以构造方法中的当前线程就是main线程。
        SubThread1 t1=new SubThread1();
        t1.start(); //启动子线程，子线程会调用run方法。所以run方法中的当前线程就是Thread-0 子线程。
        t1.run(); //在main方法中直接点用main()方法，没有开启新线程，所以在run方法中就是main线程。
    }
}
