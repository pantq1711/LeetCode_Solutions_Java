class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> map = new HashMap<>();
        int left = 0, maxLen = 0;
        for(int right = 0; right < fruits.length; right++){
            map.put(fruits[right], right);
            if(map.size() > 2) {
                int oldestIndex = fruits.length;
                int fruitToDrop = -1;
                for (Map.Entry<Integer, Integer> entry : map.entrySet()){
                    if(entry.getValue() < oldestIndex){
                        oldestIndex = entry.getValue();
                        fruitToDrop = entry.getKey();
                    }
                }
                left = oldestIndex + 1;
                map.remove(fruitToDrop);
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}