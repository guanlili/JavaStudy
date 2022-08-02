
import java.io.*;

public class demo10_write {
    public static void main(String[] args) {
        try {
            File file=new File("aa.txt");
            FileInputStream f1=new FileInputStream(file);//这里需要进行抛出异常处理
            for (int i = 0; i < file.length(); i++) {
                char ch=(char)(f1.read());//循环读取字符
                System.out.print(ch+" ");
            }
            System.out.println();//换行操作
            f1.close();//关闭文件
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("文件打开失败");
        }

    }
}
