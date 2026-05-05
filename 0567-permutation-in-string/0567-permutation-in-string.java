class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;
        int[] cnt1 = new int[26];
        int[] cnt2 = new int[26];
        for(int i = 0; i < s1.length(); i++){
            cnt1[s1.charAt(i) - 'a']++;
            cnt2[s2.charAt(i) - 'a']++;
        }
        for(int i = s1.length(); i < s2.length(); i++){
            if(Arrays.equals(cnt1, cnt2)) return true;
            cnt2[s2.charAt(i) - 'a']++;
            cnt2[s2.charAt(i - s1.length()) - 'a']--;
        }
        return Arrays.equals(cnt1, cnt2);
    }
}