class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            int val = Math.abs(nums[i]);
            int index = val - 1;
            if(nums[index] > 0){
                nums[index] = - nums[index];
            }
            else res.add(Math.abs(val));
        }
        return res;
    }
}