package com.wkcto.threadmehtod;

/**
 * @version 1.0
 * @auther guanhongli
 * @date 2022/7/12 11:17 AM
 */
public class TestIsAlive {
    public static void main(String[] args) {
        SubThread3 t3 = new SubThread3();
        System.out.println("begin=="+t3.isAlive());//false在启动线程之前
        t3.start();
        System.out.println("end=="+t3.isAlive());//结果不确定

    }
}
