class Solution {
    public int maxProduct(int[] nums) {
        int curMax = 1, curMin = 1, res = nums[0];
        for(int num : nums){
            if(num < 0){
                int tmp = curMax;
                curMax = curMin;
                curMin = tmp;
            }
            curMax = Math.max(num, num * curMax);
            curMin = Math.min(num, num * curMin);
            res = Math.max(res, curMax);
        }
        return res;
    }
}