class Solution {
    public String minWindow(String s, String t) {
        int count = 0;
        int[] cnt = new int[128];
        int minLen = Integer.MAX_VALUE;
        int startIndex = 0;
        for(char c : t.toCharArray()){
            cnt[c]++;
        }
        int left = 0;
        for(int right = 0; right < s.length(); right++){
            char c = s.charAt(right);
            cnt[c]--;
            if(cnt[c] >= 0) count++;
            while(count == t.length()){
                if(right - left + 1 < minLen){
                    minLen = right - left + 1;
                    startIndex = left;
                }
                cnt[s.charAt(left)]++;
                if(cnt[s.charAt(left)] == 1) count--;
                left++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(startIndex, startIndex + minLen);
    }
}