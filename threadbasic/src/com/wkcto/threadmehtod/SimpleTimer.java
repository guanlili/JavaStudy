package com.wkcto.threadmehtod;

/**
 * 简易计时器
 * @version 1.0
 * @auther guanhongli
 * @date 2022/7/12 2:24 PM
 */
public class SimpleTimer {
    public static void main(String[] args) {
        int remaining=10; //从60s开始
        if (args.length==1){
            remaining=Integer.parseInt(args[0]);
        }
        while (true){
            System.out.println("Remaining:"+remaining);
            remaining --;
            if (remaining<0){
                break;
            }
            try {
                Thread.sleep(1000);//线程休眠
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
        System.out.println("done!");
    }
}
