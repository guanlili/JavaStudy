/**
 * @version 1.0
 * @auther guanhongli
 * @date 2023/2/3 9:22 PM
 */
public class leetcode35 {
    public static int searchInsert(int[] nums, int target) {
        //二分法
        int left =0;
        int right = nums.length-1;
        //target在nums外
//        if (target>nums[nums.length-1] ){
//            return nums.length;
//        }
//        if (target<nums[0]){
//            return 0;
//        }
        while (left<=right){
            int mid = (left+right)/2;
            if (nums[mid]==target){
                return mid;
            }
            if (nums[mid]>target){
                right=mid-1;
            }
            if (nums[mid]<target){
                left=mid+1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] nums ={1,3,5,6,8};
        int target = 11;
        int local = searchInsert(nums,target);
        System.out.println("local"+local);

    }

}
