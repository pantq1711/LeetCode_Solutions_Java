class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int curSum = 0;
        int cnt = 0;
        for(int num : nums){
            curSum += num;
            int rem = (curSum % k + k) % k;
            if(map.containsKey(rem)){
                cnt += map.get(rem);
            }
            map.put(rem, map.getOrDefault(rem, 0) + 1);
        }
        return cnt;
    }
}