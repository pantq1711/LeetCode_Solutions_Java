class Solution {
    public int trap(int[] height) {
        int left = 0, right = height.length - 1;
        int bestHeightLeft = height[left], bestHeightRight = height[right];
        int res = 0;
        while(left < right){
            if(height[left] <= height[right]){
                if(height[left] > bestHeightLeft){
                    bestHeightLeft = height[left];
                }
                else res += bestHeightLeft - height[left];
                left++;
            }
            else {
                if(height[right] > bestHeightRight){
                    bestHeightRight = height[right];
                }
                else res += bestHeightRight - height[right];
                right--;
            }
        }
        return res;
    }
}