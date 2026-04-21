class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int res = 0, sum = 0;
        for(int num : nums){
            sum += num;
            int numDiv = (sum % k + k) % k;
            if(map.containsKey(numDiv)){
                res += map.get(numDiv);
            }
            map.put(numDiv, map.getOrDefault(numDiv, 0) + 1);
        }
        return res;
    }
}