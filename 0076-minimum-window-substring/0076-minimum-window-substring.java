class Solution {
    public String minWindow(String s, String t) {
        int[] cnt = new int[256];
        for(char c : t.toCharArray()){
            cnt[c]++;
        }
        int count = 0;
        int left = 0;
        int start = 0;
        int len = Integer.MAX_VALUE;
        for(int right = 0; right < s.length(); right++){
            char c = s.charAt(right);
            cnt[c]--;
            if(cnt[c] >= 0) count++;
            while(count == t.length()){
                if(right - left + 1 < len){
                    len = right - left + 1;
                    start = left;
                }
                cnt[s.charAt(left)]++;
                if(cnt[s.charAt(left)] == 1) count--;
                left++;
            }
        }
        return len == Integer.MAX_VALUE ? "" : s.substring(start, start + len);
    }
}