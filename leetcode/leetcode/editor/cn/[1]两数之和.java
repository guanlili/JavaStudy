//给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target 的那 两个 整数，并返回它们的数组下标。 
//
// 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。 
//
// 你可以按任意顺序返回答案。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [2,7,11,15], target = 9
//输出：[0,1]
//解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
// 
//
// 示例 2： 
//
// 
//输入：nums = [3,2,4], target = 6
//输出：[1,2]
// 
//
// 示例 3： 
//
// 
//输入：nums = [3,3], target = 6
//输出：[0,1]
// 
//
// 
//
// 提示： 
//
// 
// 2 <= nums.length <= 10⁴ 
// -10⁹ <= nums[i] <= 10⁹ 
// -10⁹ <= target <= 10⁹ 
// 只会存在一个有效答案 
// 
//
// 进阶：你可以想出一个时间复杂度小于 O(n²) 的算法吗？ 
// Related Topics 数组 哈希表 👍 14750 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        //我们要找到2个数之和等于target
        //即我们需要找到nums[i] + nums[j] == target，并且返回他们的下标，即i和j，其中i != j
        int[] ans = new int[2]; //声明一个大小为2的数组用来保存结果
        //我们通过循环来遍历所有的数字
        int n = nums.length;  //用一个变量len保存nums的长度
        //i为第一个数的下标，nums一共有n个数，所以i的取值范围是[0, n-1]
        for(int i = 0; i < n; i++){
            //j为第二个数的下标。
            for(int j = i + 1; j < n; j++){
                //对于每个数nums[i]，我们验证一遍其他数（nums[j]）跟它的和是否等于target
                //如果满足条件
                if(nums[i] + nums[j] == target){
                    //将下标写入返回值数组里
                    ans[0] = i;
                    ans[1] = j;
                    //返回
                    return ans;
                }
            }
        }
        //默认返回值
        return new int[0];
    }
}
//leetcode submit region end(Prohibit modification and deletion)
