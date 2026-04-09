class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map <String, List<String>> map = new HashMap<>();
        for(String s : strs){
            char[] str = s.toCharArray();
            Arrays.sort(str);
            map.computeIfAbsent(String.valueOf(str), k -> new ArrayList<>()).add(s);
        }
        List<List<String>> res = new ArrayList<>(map.values());

        res.sort((list1, list2) -> Integer.compare(list1.size(), list2.size()));
        return new ArrayList<>(map.values());
    }
}