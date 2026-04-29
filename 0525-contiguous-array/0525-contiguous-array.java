class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int sum = 0;
        int res = 0;
        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            sum += (num == 0) ? -1 : 1;
            if(map.containsKey(sum)){
                res = Math.max(i - map.get(sum), res);
            }
            else map.put(sum, i);
        }
        return res;
    }
}