class Solution {
    public int maxArea(int[] height) {
        int lp = 0;
        int rp = height.length-1;
        int max = 0;
        while(lp < rp){
            int h = Math.min(height[lp],height[rp]);
            int w = rp - lp;
            int area = h * w;
            max = Math.max(max,area);
            if(height[lp]<height[rp]){
                lp++;
            }else{
                rp--;
            }
        }
        return max;
    }
}