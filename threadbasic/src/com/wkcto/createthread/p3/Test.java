package com.wkcto.createthread.p3;

/**
 * @version 1.0
 * @auther guanhongli
 * @date 2022/7/11 2:55 PM
 * 测试实现Runnable借口的形式创建线程
 */
public class Test {
    public static void main(String[] args) {
        //3创建接口的实现类对象
        MyRunable runable =new MyRunable();
        //4创建线程对象
        Thread thread =new Thread(runable);
        //5启动线程
        thread.start();
        for (int i=0;i<100;i++){
            System.out.println("main:"+i);
        }

        //有时调用Thread(Runnable)构造方法时，实参也会传递匿名内部类对象
        Thread thread2 =new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("sub--------------:" + i);
                }
            }
        });
        thread2.start();


    }
}
