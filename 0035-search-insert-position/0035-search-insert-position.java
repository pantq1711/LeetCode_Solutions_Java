class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = 0, r = nums.length - 1, ans = -1;
        while(l <= r){
            int mid = l + (r - l) / 2;
            if(nums[mid] == target){
                ans = mid;
                break;
            }
            else if(nums[mid] > target) r = mid - 1;
            else l = mid + 1;
        }
        if(ans == -1){
            if(target < nums[0]) return 0;
            else if(target > nums[nums.length - 1]) return nums.length;
            else return l;
        }
        return ans;
    }
}