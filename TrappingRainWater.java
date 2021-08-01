class TrappingRainWater {
    public int trap(int[] height) {
        int left = 0;
        int right = 0;
        int low = 0;
        int high = height.length - 1;
        int ans = 0;
        while(low < high){
            left = Math.max(left,height[low]);
            right = Math.max(right, height[high]);
            if(left < right){
                ans += left - height[low];
                low++;
            }else{
                ans += right - height[high];
                high--;
            }
        }
        return ans;
    }
}
