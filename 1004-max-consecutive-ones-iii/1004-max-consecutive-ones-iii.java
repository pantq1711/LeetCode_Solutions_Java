class Solution {
    public int longestOnes(int[] nums, int k) {
        int res = 0;
        int left = 0;
        int countZero = 0;
        for(int right = 0; right < nums.length; right++){
            if(nums[right] == 0){
                countZero++;
            }
            while(countZero > k && left < nums.length){
                if(nums[left] == 0) countZero--;
                left++;
            }
            res = Math.max(res, right - left + 1);
        }
        return res;
    }
}