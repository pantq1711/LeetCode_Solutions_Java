class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length == 1) return  nums[0];
        int curNum = nums[0];
        int cnt = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == curNum){
                cnt++;
            }
            else {
                cnt--;
                if(cnt < 0){
                    curNum = nums[i];
                    cnt = 0;
                }
            }
        }
        return curNum;
    }
}