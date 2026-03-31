class Solution {
    public int[] sortedSquares(int[] nums) {
        int l = 0, r = nums.length - 1;
        int right = r;
        int res[] = new int[r + 1];
        while(l <= r){
            int a = Math.abs(nums[l]), b = Math.abs(nums[r]);
            if(a < b){
                res[right] = b * b;
                r--;
            }
            else{
                res[right] = a * a;
                l++;
            }
            right--;
        }
        return res;
    }
}