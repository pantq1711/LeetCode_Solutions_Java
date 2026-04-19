class Solution {
    public int maxArea(int[] height) {
        int res = 0;
        int left = 0, right = height.length - 1;
        while(left < right){
            int width = right - left;
            int area = width * Math.min(height[left], height[right]);
            res = Math.max(area, res);
            if(height[left] < height[right]) left++;
            else right--;
        }
        return res;
    }
}