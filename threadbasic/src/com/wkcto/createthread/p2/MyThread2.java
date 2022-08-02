package com.wkcto.createthread.p2;

/**
 * @version 1.0
 * @auther guanhongli
 * @date 2022/7/11 2:46 PM
 */
public class MyThread2 extends Thread {
    @Override
    public void run(){
        for(int i=1;i<10;i++){
            System.out.println("sub thread:"+i);
            int time= (int)(Math.random()*1000);
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
