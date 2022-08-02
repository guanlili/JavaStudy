package com.wkcto.threadmehtod;

/**
 * @version 1.0
 * @auther guanhongli
 * @date 2022/7/11 5:20 PM
 */
public class SubThread1 extends Thread{
    public SubThread1(){
        System.out.println("构造方法打印当前线程的名称"+Thread.currentThread().getName());

    }

    @Override
    public void run(){
        System.out.println("run打印当前线程的名称"+Thread.currentThread().getName());
    }
}
