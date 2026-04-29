class Solution {
    public String minWindow(String s, String t) {
        int[] cnt = new int[128];
        for(char c : t.toCharArray()){
            cnt[c]++;
        }
        int count = 0;
        int left = 0;
        int right = 0;
        int startIndex = 0, minLen = Integer.MAX_VALUE;
        while(right < s.length()){
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
            right++;
        }
        return (minLen == Integer.MAX_VALUE)  ? "" : s.substring(startIndex,startIndex + minLen);

    }
}