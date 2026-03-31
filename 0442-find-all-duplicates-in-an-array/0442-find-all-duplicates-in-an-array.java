class Solution {
     public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            int val = Math.abs(nums[i]);
            int index = val - 1;
            if(nums[index] > 0){
                nums[index] = -nums[index];
            }
            else {
                list.add(Math.abs(val));
            }
        }
        return list;
    }
}