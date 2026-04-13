class Solution {
    public void rotate(int[] nums, int k) {
        int[] res = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            res[(i + k) % nums.length] = nums[i];
        }
        System.arraycopy(res, 0, nums, 0, nums.length );
    }
}