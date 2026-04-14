class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Map<Integer, List<List<Integer>>> map = new HashMap<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2; i++){
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            int left = i + 1, right = nums.length - 1;
            while(left < right){
                if(nums[left] + nums[right] + nums[i] == 0){
                    map.computeIfAbsent(i, k -> new ArrayList<>())
                            .add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while(left < nums.length - 1 && nums[left] == nums[left + 1]) left++;
                    while(right > 0 && nums[right] == nums[right - 1]) right--;
                    left++;
                    right--;
                }
                else if(nums[left] + nums[right] + nums[i] > 0){
                    right--;
                }
                else left++;
            }
        }
        List<List<Integer>> result = new ArrayList<>();
        for (List<List<Integer>> triplets : map.values()) {
            result.addAll(triplets);
        }
        return result;
    }
}