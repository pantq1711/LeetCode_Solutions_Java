class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> res = new HashSet<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2; i++){
                        if(i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1, right = nums.length - 1;
            while(left < right){
                if(nums[i] + nums[left] + nums[right] == 0){
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                }
                else if(nums[i] + nums[left] + nums[right] > 0){
                    right--;
                }
                else {
                    left++;
                }
            }
        }
        return new ArrayList<>(res);
    }
}