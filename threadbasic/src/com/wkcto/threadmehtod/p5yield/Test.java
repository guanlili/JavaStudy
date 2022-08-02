package com.wkcto.threadmehtod.p5yield;

/**
 * @version 1.0
 * @auther guanhongli
 * @date 2022/7/12 2:42 PM
 */
public class Test {
    public static void main(String[] args) {
        //开启子线程，计算累加和
        SubThread6 t6=new SubThread6();
        t6.start();

        //在main开启累加和。
        long begin=System.currentTimeMillis();
        long sum =0;
        for(int i=1;i<10000000;i++){
            sum+=i;
        }
        long end =System.currentTimeMillis();
        System.out.println("main用时："+(end-begin));
    }
}
