class Solution {
     public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> array = new HashSet<>();
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) array.add(nums[i]);
        for(int i = 1; i <= nums.length; i++){
            if(!array.contains(i)){
                res.add(i);
            }
        }
        return res;
    }
}