package com.wkcto.threadmehtod;

/**
 * @version 1.0
 * @auther guanhongli
 * @date 2022/7/12 11:16 AM
 */
public class SubThread3 extends Thread{
    @Override
    public void run(){
        System.out.println("run方法，is_alive="+this.isAlive());

    }
}
