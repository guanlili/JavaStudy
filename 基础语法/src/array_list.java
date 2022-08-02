/**
 * @version 1.0
 * @auther guanhongli
 * @date 2022/7/13 5:07 PM
 */
import java.util.ArrayList;

public class array_list {
    public static void main(String[] args) {
        ArrayList<String> sites = new ArrayList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");
        sites.add(4,"aaa");
        System.out.println(sites);
        System.out.println(sites.size());

        System.out.println(sites.get(1));  // 访问第二个元素
//
//        for (int i=0;i<sites.size();i++){
//            System.out.println(sites.get(i));
//        }
        for (String i :sites){
            System.out.println(i);
        }
    }




}
