import java.util.Arrays;

/**
 * @version 1.0
 * @auther guanhongli
 * @date 2022/7/13 5:07 PM
 *
 * 26. 删除有序数组中的重复项
 */

public class leetcode26 {
    public static void main(String[] args) {
        int[] nums = {1,1,3,3,3,3,5,6,6,6,7,7,8,9};
        System.out.println("初始"+Arrays.toString(nums));

        System.out.println(nums.length);
        int i =0;
        int j =1;
        while (j<nums.length){
            if (nums[i]!=nums[j]){
                nums[i+1]=nums[j];
                i++;
            }
            j++;
        }
        int [] b = Arrays.copyOfRange(nums,0,i+1);//b:[3,9]
//        System.out.println("结果"+Arrays.toString(nums));
        System.out.println("结果"+Arrays.toString(b));

    }




}
