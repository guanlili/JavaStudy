package com.wkcto.threadmehtod.p4getid;

/**
 * @version 1.0
 * @auther guanhongli
 * @date 2022/7/12 2:31 PM
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()+"id="+Thread.currentThread().getId());
        //子线程id
        for(int i=1;i<=20;i++){
            new SubThread5().start();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
