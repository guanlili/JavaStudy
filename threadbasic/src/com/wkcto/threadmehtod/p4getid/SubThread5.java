package com.wkcto.threadmehtod.p4getid;

/**
 * @version 1.0
 * @auther guanhongli
 * @date 2022/7/12 2:31 PM
 */
public class SubThread5 extends Thread{
    @Override
    public void run(){
        System.out.println("thread name="+Thread.currentThread().getName()+"id=="+this.getId());

    }
}
