class Solution {
    public int subarraySum(int[] nums, int k) {
        int cnt = 0;
        int l = 0, r = nums.length - 1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int sum = 0;
            for(int j = i; j < nums.length; j++){
                sum +=  nums[j];
                if(sum == k) cnt++;
            }
        }
        return cnt;
    }
}