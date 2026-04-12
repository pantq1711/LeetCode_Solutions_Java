class Solution {
    public int trap(int[] height) {
        int l = 0, r = height.length - 1;
        int totalWater = 0;
        int maxLeft = 0, maxRight = 0;
        while(l < r){
            if(height[l] <= height[r]){
                if(height[l] >= maxLeft) maxLeft = height[l];
                else totalWater += maxLeft - height[l];
                l++;
            }
            else {
                if(height[r] >= maxRight) maxRight = height[r];
                else totalWater += maxRight - height[r];
                r--;
            }
        }
        return totalWater;
    }
}