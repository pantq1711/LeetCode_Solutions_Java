class Solution {
     public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int res = 0;
        for(int num : set){
            if(!set.contains(num - 1)){
                int cnt = 1;
                int tmp = num + 1;
                while(set.contains(tmp)){
                    cnt++;
                    tmp++;
                }
                res = Math.max(res, cnt);
            }
        }
        return res;
    }
}