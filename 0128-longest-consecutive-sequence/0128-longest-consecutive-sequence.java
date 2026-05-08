class Solution {
    public int longestConsecutive(int[] nums) {
        int res = 1;
        Arrays.sort(nums);
        int left = 1;
        while(left < nums.length){
            int cnt = 1;
            while(left < nums.length){
                if( nums[left - 1] + 1 == nums[left]){
                    cnt++;
                    left++;
                }
                else if( nums[left - 1] == nums[left])
                left++;
                else break;
            }
            left++;
            res = Math.max(res,cnt);
        }
        return nums.length == 0 ? 0 : res;
    }
}