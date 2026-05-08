class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        List<List<String>> res = new ArrayList<>();
        for(String str : strs){
            char[] tmp = str.toCharArray();
            Arrays.sort(tmp);
            String key = new String(tmp);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }
        for(Map.Entry<String, List<String>> mp : map.entrySet()){
            res.add(mp.getValue());
        }
        return res;
    }
}