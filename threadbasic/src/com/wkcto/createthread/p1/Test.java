package com.wkcto.createthread.p1;

/**
 * @version 1.0
 * @auther guanhongli
 * @date 2022/7/11 2:23 PM
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("jmv启动main线程，main线程执行main方法");
        //创建子线程对象
        MyThread thread = new MyThread();
        //启动线程
        thread.start();
        /*
        调用线程的start()方法来启动线程，启动线程的实质就是请求JVM运行相应的线程，这个线程具体在什么时候运行由线程调度器（Scheduler）决定
        注意：start()方法调用结束并不意味着子线程开始运行
        新开启的线程会执行run()方法
        开启了多个线程，start()调用的顺序不一定是线程启动的顺序
        多线程运行的结果与代码顺序无关
         */
        System.out.println("start之后的结果");

    }
}
