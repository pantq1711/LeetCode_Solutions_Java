class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        if(nums.length == 0) return 0;
        int res = 1;
        for(int num : nums){
            set.add(num);
        }
        int cnt = 0;
        for(int num : set){
            int tmp = num;
            if(!set.contains(tmp - 1)){
                cnt = 0;
                while(set.contains(tmp)){
                    tmp++;
                    cnt++;
                }
            }
            res = Math.max(cnt, res);
        }
        return res;
    }
}