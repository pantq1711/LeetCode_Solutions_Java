class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;
        int[] cnt1 = new int[26];
        int[] cnt2 = new int[26];
        for(int i = 0; i < s1.length(); i++){
            cnt2[s2.charAt(i) - 'a']++;
            cnt1[s1.charAt(i) - 'a']++;
        }
        int matches = 0;
        for(int i = 0; i < 26; i++){
            if(cnt1[i] == cnt2[i]) matches++;
        }

        for(int right = s1.length(); right < s2.length(); right++){
            if(matches == 26) return true;
            int indexRight = s2.charAt(right) - 'a';
            cnt2[indexRight]++;
            if(cnt1[indexRight] == cnt2[indexRight]) matches++;
            else if(cnt1[indexRight] + 1== cnt2[indexRight] ) matches--;
            
            int indexLeft = s2.charAt(right - s1.length()) - 'a';
            cnt2[indexLeft]--;
            if(cnt1[indexLeft] == cnt2[indexLeft]) matches++;
            else if(cnt1[indexLeft] == cnt2[indexLeft] + 1) matches--;
        }
        return matches == 26;
    }
}