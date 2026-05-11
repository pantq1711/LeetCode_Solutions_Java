class Solution {
    public void sortColors(int[] nums) {
        int index = 0;
        int left = 0, right = nums.length - 1;
        while(index <= right){
            if(nums[index] == 0){
                nums[index++] = nums[left];
                nums[left++] = 0;
            }
            else if(nums[index] == 1){
                index++;
            }
            else{
                nums[index] = nums[right];
                nums[right--] = 2;
            }
        }
    }
}