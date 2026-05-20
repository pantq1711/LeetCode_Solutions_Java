class Solution {
public int longestConsecutive(int[] nums) {
    Set<Integer> set = new HashSet<>();
    for(int num : nums){
        set.add(num);
    }
    int res = 0;
    for(int num : set){
        if(!set.contains(num - 1)){
            int tmp = num;
            int cnt = 0;
            while(set.contains(tmp)){
                tmp++;
                cnt++;
            }
            res = Math.max(res, cnt);
        }
    }
    return res;
}
}