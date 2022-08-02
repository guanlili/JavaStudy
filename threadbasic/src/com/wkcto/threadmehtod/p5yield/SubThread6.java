package com.wkcto.threadmehtod.p5yield;

/**
 * @version 1.0
 * @auther guanhongli
 * @date 2022/7/12 2:40 PM
 */
public class SubThread6 extends Thread{
    @Override
    public void run(){
        long begin=System.currentTimeMillis();
        long sum =0;
        for(int i=1;i<10000000;i++){
            sum+=i;
            Thread.yield();//线程让步，放弃cpu执行权
        }
        long end =System.currentTimeMillis();
        System.out.println("子线程用时："+(end-begin));

    }
}
