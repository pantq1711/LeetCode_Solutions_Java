class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int maxVal = nums[0];
        for(int num : nums){
            sum = Math.max(num, num + sum);
            maxVal = Math.max(sum, maxVal);
        }
        return maxVal;
    }
}