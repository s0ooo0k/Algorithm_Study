class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int max=0;

        for(int i=0; i<n-1; i++) {
            for(int j=1; j<n; j++) {
                int water = Math.abs(i-j) * Math.min(height[i], height[j]);
                max = Math.max(max, water);
            }
        }
        return max;
    }
}