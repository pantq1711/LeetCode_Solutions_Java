class Solution {
    public int maxArea(int[] height) {
        int res = 0;
        int left = 0, right = height.length - 1;
        while(left < right){
            int curHeight = Math.min(height[left], height[right]);
            int curWidth = right - left;
            res = Math.max(res, curHeight * curWidth);
            if(height[left] <= height[right]){
                left++;
            }
            else right--;
        }
        return res;
    }
}