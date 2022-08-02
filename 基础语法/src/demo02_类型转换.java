/**
 * @author guanhongli
 */
public class demo02_类型转换 {
    public static void main(String[] args) {
        int i =128;
        byte b =(byte) i;//内存溢出
        //强制转换    （类型）变量名
        System.out.println(i);
        System.out.println(b);
        /*
        1。不能对布尔值进行转换。
        2。不能把对象类型转换为不相干的类型
        3。在吧高容量转换到低容量的时候，强制转换。
        4。转换的时候可能存在内存溢出，或者精度问题。
         */
        System.out.println((int)23.7);
        System.out.println((int)-45.89f);
        char c='a';
        int d =c+1;
        System.out.println(d);
        System.out.println((char)d);

        //操作大数的时候，注意溢出问题
        //jdk7新特性，数字之间可以用下划线分割。
        int money=10_0000_0000;
        int years =20;
        int totle=money*years;
        System.out.println(totle);
        //-1474836480 计算的时候溢出了
        long totle2 =money*years;
        System.out.println(totle2);
        //默认是int,转换之前已经存在问题了。
        long totle3=money*((long)years);
        //先把一个数转为log
        System.out.println(totle3);

        // L l
    }
}

