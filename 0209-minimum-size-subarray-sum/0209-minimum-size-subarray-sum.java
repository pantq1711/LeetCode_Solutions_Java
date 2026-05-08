class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int res = 0;
        int[] sum = new int[nums.length + 1];
        for(int i = 0; i < nums.length; i++){
            sum[i + 1] = sum[i] + nums[i];
        }
        int low = 1, high = nums.length;
        while(low <= high){
            int mid = high + (low - high) / 2;
            if(check(mid, target, sum)){
                res = mid;
                high = mid - 1;
            }
            else low = mid + 1;
        }
        return res;
    }

    public boolean check(int size, int target, int sum[]){
        for(int i = size; i < sum.length; i++){
            if(sum[i] - sum[i - size] >= target) return true;
        }
        return false;
    }
}