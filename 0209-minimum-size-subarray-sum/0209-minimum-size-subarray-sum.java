class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int left = 0;
        int res = Integer.MAX_VALUE;
        for(int right = 0; right < nums.length; right++){
            sum += nums[right];
            while(sum >= target){
                sum -= nums[left];
                res = Math.min(res, right - left + 1);
                left++;
            }
        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }
}