class Solution {
    public int threeSumClosest(int[] nums, int target) {
        List<Integer> res = new ArrayList<>();
        int closestSum = nums[0] + nums[1] + nums[2];
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2; i++){
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            int left = i + 1, right = nums.length - 1;
            while(left < right){
                int curSum = nums[i] + nums[left] + nums[right];
                if(curSum == target) {
                    return target;
                }
                if(Math.abs(closestSum - target) > Math.abs(curSum - target)){
                    closestSum = curSum;
                }
                if(curSum > target) right--;
                else left++;
            }
        }
        return closestSum;
    }
}