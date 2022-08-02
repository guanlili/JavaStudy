
import java.io.*;

public class demo10_file {
    public static void main(String[] args) {
        File f1=new File("aa.txt");//相对路径，如果没有前面的src，就在当前目录创建文件
        if(f1.exists()) {
            System.out.println("文件已经存在");
        }else {
            try {
                f1.createNewFile();
                System.out.println("文件创建成功");
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
        System.out.println("文件已经存在:"+f1.exists());
        System.out.println("文件的名字:"+f1.getName());
        System.out.println("文件的路径:"+f1.getPath());
        System.out.println("文件的绝对路径:"+f1.getAbsolutePath());
        System.out.println("是目录吗:"+f1.isDirectory());
        System.out.println("文件大小:"+f1.length());
    }
}
