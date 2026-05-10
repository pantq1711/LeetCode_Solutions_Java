class Solution {
    public String minWindow(String s, String t) {
        Map<Character, Integer> targetMap = new HashMap<>();
        for(char c : t.toCharArray()){
            targetMap.put(c , targetMap.getOrDefault(c, 0) + 1);
        }
        Map<Character, Integer> windowMap = new HashMap<>();
        int left = 0;
        int charCount = 0;
        int start = 0;
        int len = Integer.MAX_VALUE;
        for(int right = 0; right < s.length(); right++){
            char c = s.charAt(right);
            windowMap.put(c, windowMap.getOrDefault(c, 0) + 1);
            if(targetMap.containsKey(c) && targetMap.get(c).equals(windowMap.get(c))){
                charCount++;
            }
            while(charCount == targetMap.size()){
                int windowLen = right - left + 1;
                if(windowLen < len){
                    len = windowLen;
                    start = left;
                }
                char leftChar = s.charAt(left);
                if(targetMap.containsKey(leftChar) && targetMap.get(leftChar).equals(windowMap.get(leftChar))){
                    charCount--;
                }
                windowMap.put(leftChar, windowMap.get(leftChar) - 1);
                left++;
            }
        }
        return len == Integer.MAX_VALUE ? "" : s.substring(start, start + len);
    }
}