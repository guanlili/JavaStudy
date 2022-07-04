public class demo6 {
    public static void main(String[] args) {
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
