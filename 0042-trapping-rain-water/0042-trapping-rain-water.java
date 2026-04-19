class Solution {
    public int trap(int[] height) {
        int left = 0, right = height.length - 1;
        int res = 0;
        int maxLeft = height[left] , maxRight = height[right];
        while(left <= right){
            if(maxLeft <= maxRight){
                if(maxLeft >= height[left]) res += maxLeft - height[left];
                else maxLeft = height[left];
                left++;
            }
            else {
                if(maxRight >= height[right]) res += maxRight - height[right];
                else maxRight = height[right];
                right--;
            }
        }
        return res;
    }
}