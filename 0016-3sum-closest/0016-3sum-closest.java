class Solution {
    public int findCloset(List<Integer> list, int target){
        return list.stream()
                .min(Comparator.comparingInt(num -> Math.abs(num - target)))
                .orElseThrow(); 
    }

    public int threeSumClosest(int[] nums, int target) {
        List<Integer> res = new ArrayList<>();
        int sumCloset = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2; i++){
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            int left = i + 1, right = nums.length - 1;
            while(left < right){
                if(nums[i] + nums[left] + nums[right] == target) {
                    return target;
                }
                res.add(nums[i] + nums[left] + nums[right]);
                if(nums[i] + nums[left] + nums[right] > target) right--;
                else left++;
                // while(left < right && nums[left] == nums[left + 1]) left++;
                // while(left < right && nums[right] == nums[right - 1]) right--;
            }
        }
        return findCloset(res, target);
    }
}