//https://leetcode.com/problems/trapping-rain-water/

class Solution {
    public int trap(int[] height) {
    int [] left = new int[height.length];
    int [] right = new int[height.length];
    left[0] = height[0];
    right[height.length-1] = height[height.length-1];    
    int lmax = 0;
    int rmax = 0; 
    
    int water = 0;

    if(height.length < 3)
    {
        return 0;
    }

    for (int i = 0; i < height.length; i++) {
        left[i] = Math.max(lmax, height[i]);
        lmax = Math.max(lmax, height[i]);
        int j = height.length - i -1;
        right[j] = Math.max(rmax, height[j]);
        rmax = Math.max(rmax, height[j]);

        
    }


    for (int k = 0; k < height.length; k++) {
        int temp = Math.min(left[k], right[k]);
        water = water + temp - height[k];
    }

    return water;

    }
}
