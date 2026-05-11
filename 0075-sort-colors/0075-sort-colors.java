class Solution {
    public void sortColors(int[] nums) {
        int[] cnt = new int[3];
        for(int num : nums){
            cnt[num]++;
        }
        int left = 0;
        for(int i = 0; i <= 2; i++){
            while(cnt[i] > 0){
                nums[left++] = i;
                cnt[i]--;
            }
        }
    }
}