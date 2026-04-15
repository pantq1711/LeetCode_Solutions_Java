class Solution {
    public boolean canJump(int[] nums) {
        int stepCount = nums[0];
        if(nums.length <= 1) return true;
        if(stepCount == 0) return false;
        for(int i = 1; i < nums.length - 1; i++){
            stepCount--;
            stepCount = Math.max(stepCount, nums[i]);
            if(stepCount <= 0) return false;
        }
        return true;
    }
}