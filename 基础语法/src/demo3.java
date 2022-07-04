public class demo3 {
    public static void main(String[] args) {
        //整数拓展，进制
        int i=10;
        int i2=010;//八进制0
        int i3= 0X10;//十六进制0x
        System.out.println(i);
        System.out.println(i2);
        System.out.println(i3);

        //银行业务拓展，银行业务怎么表示钱。
        //bigdecimal 数学工具类。
        //float 有限，离散 舍入误差，大约，接近但不等于
        // double
        //最好避免使用浮点数进行比较。
        //最好避免使用浮点数进行比较。
        //最好避免使用浮点数进行比较。

        float f =0.1f;//0.1
        double d =1.0/10;//0.1
        System.out.println(f==d);//false
        System.out.println(f);
        System.out.println(d);
        float d1 =232322323232f;
        float d2 =d1 +1;
        System.out.println(d1==d2);//true

        //字符拓展。
        char c1 ='a';
        char c2='中';
        System.out.println(c1);
        System.out.println((int)c1);
        System.out.println(c2);
        System.out.println((int)c2);
        //所有的字符本质还是数字。
        //编码 unicode （97=a  64=A） 2字节， 65536个字符。  excel 2 16  =65536
        //U0000 UFFFF
        char c3='\u0061';
        System.out.println(c3);
        //a
        //转义字符
        //  \t 制表符
        //  \n 换行   。。。还有更多。

        String sa=new String("hello world");
        String sb =new String("hello world");
        System.out.println(sa==sb);
        //false

        String sc ="hello world";
        String sd ="hello world";
        String se =new String(sc);
        System.out.println(sc==sd);
        //true

        //对象，从内存分析
        //布尔值扩展
        boolean flag =true;
        if(flag){

        }
        //less is more 精简易读



    }
    }

