class Solution {
    public int[] sortedSquares(int[] nums) {
        int l = 0, r =  nums.length - 1;
        int res[] = new int[nums.length];
        int index = r;
        while(l <= r){
            int a = Math.abs(nums[l]), b = Math.abs(nums[r]);
            if(a > b){
                res[index--] = a * a;
                l++;
            }
            else {
                res[index--] = b * b;
                r--;
            }
        }
        return res;
    }
}