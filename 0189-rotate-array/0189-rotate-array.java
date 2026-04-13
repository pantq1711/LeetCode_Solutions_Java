class Solution {
    public void rotate(int[] nums, int k) {
        rotate(0, nums.length - 1, nums);
        rotate(0, k - 1, nums);
        rotate(k, nums.length - 1, nums);
    }
    private void rotate(int l, int r, int[] nums){
        while(l < r){
            int tmp = nums[l];
            nums[l] = nums[r];
            nums[r] = tmp;
            l++;
            r--;
        }
    }
}