class Solution {
    public int maxSubArray(int[] nums) {
        int sum1 = 0, sum2 = Integer.MIN_VALUE, tmp = Integer.MIN_VALUE;
        boolean check = false;
        for(int num : nums){
            if(num >= 0) check = true;
            tmp = Math.max(tmp, num);
            sum1 += num;
            if(sum1 < 0) sum1 = 0;
            sum2 = Math.max(sum1, sum2);
        }
        return check ? sum2 : tmp;
    }
}