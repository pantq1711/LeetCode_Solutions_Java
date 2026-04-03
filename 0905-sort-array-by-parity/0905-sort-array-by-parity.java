class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int res[] = new int[nums.length];
        int l = 0;
        for(int num : nums){
            if(num % 2 == 0) res[l++] = num;
        }
        for(int num : nums){
            if(num % 2 == 1) res[l++] = num;
        }
        return res;
        
    }
}