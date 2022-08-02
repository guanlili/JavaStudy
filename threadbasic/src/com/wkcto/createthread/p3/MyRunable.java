package com.wkcto.createthread.p3;

/**
 * @version 1.0
 * @auther guanhongli
 * @date 2022/7/11 3:06 PM
 * 1定义类实现Runnalbe
 */
public class MyRunable implements Runnable {
    //2重写Runnable接口中的抽象方法run().run(）方法就是子线程要执行的代码
    @Override
    public void run(){
        for (int i=0;i<100;i++){
            System.out.println("sub_thread:"+i);
        }
    }
}
