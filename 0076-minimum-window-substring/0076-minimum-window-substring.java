class Solution {
    public String minWindow(String s, String t) {
        if(t.length() > s.length()) return "";
        int[] cnt = new int[128];
        String res = "";
        int count = 0;
        for(char c : t.toCharArray()){
            cnt[c]++;
        }
        int left = 0, right = 0;
        int minLen = Integer.MAX_VALUE, minStart = 0;
        while(right < s.length()){
            char c = s.charAt(right);
            cnt[c]--;
            if(cnt[c] >= 0){
                count++;
            }
            while(count == t.length()){
if (right - left + 1 < minLen) {
                minLen = right - left + 1;
                minStart = left; 
            }
                char left_window = s.charAt(left);
                cnt[left_window]++;
                if(cnt[left_window] == 1) count--;
                left++;
            }
            right++;
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
    }
}