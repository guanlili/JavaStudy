import java.util.Arrays;

/**
 * @version 1.0
 * @auther guanhongli
 * @date 2023/2/2 9:02 PM
 */
public class leetcode27 {
    public static void main(String[] args){
        //27. 移除元素
        int[] nums = {4,5};
        int val= 4;
        int i =0;
        int j =nums.length-1;
        //判断元素是否等于val 如果不等于，i+1 j+1 如果等于i不变，j+1，
        if (nums.length==0){
            System.out.println("0000");
        }

        while (i!=j){
            if (nums[i]==val){
                nums[i]=nums[j];
                j--;
            }else {
                i++;
            }
            System.out.println("i="+i);
            System.out.println(Arrays.toString(nums));
            System.out.println(nums.length);


        }
        if (i==0 && nums[i]==val){
            System.out.println("0000");
        }
        System.out.println("i+1="+(i+1));

    }

}
