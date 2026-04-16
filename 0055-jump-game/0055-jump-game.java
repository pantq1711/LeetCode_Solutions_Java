class Solution {
    public boolean canJump(int[] nums) {
        int stepsCount = nums[0];
        if(nums.length == 1) return true;
        if(nums[0] == 0) return false;
        for(int i = 1; i < nums.length - 1; i++){
            stepsCount--;
            stepsCount = Math.max(stepsCount, nums[i]);
            if(stepsCount <= 0) return false;

        }
        return true;
    }
}