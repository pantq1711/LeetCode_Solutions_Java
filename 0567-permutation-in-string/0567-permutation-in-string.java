class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int len1 = s1.length(), len2 = s2.length();
        if(len1 > len2) return false;
        int[] cnt1 = new int[26];
        int[] cnt2 = new int[26];
        for(int i = 0; i < s1.length(); i++){
            cnt1[s1.charAt(i) - 'a']++;
            cnt2[s2.charAt(i) - 'a']++;
        }
        for(int i = len1; i < len2; i++){
            if(Arrays.equals(cnt1, cnt2)) return true;
            cnt2[s2.charAt(i) - 'a']++;
            cnt2[s2.charAt((i) - len1) - 'a']--;
        }

        return Arrays.equals(cnt1, cnt2);
        
    }
}