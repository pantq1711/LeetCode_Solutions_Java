class Solution {
    public int trap(int[] height) {
        int left = 0, right = height.length - 1;
        int res = 0;
        int maxLeft = height[left], maxRight = height[right];
        while(left < right){
            if(height[left] <= height[right]){
                    maxLeft = Math.max(maxLeft, height[left]);
                    res += maxLeft - height[left];
                    left++;
                }
            else {
                    maxRight = Math.max(maxRight, height[right]);
                    res += maxRight - height[right];
                    right--;
            }
        }
        return res;
    }
}