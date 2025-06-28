class Solution {
    public int maxArea(int[] height) {
       // ArrayList<Integer> height=new ArrayList<>();
        int n = height.length;
        int str =0;
        int end= n -1;
        int maxarr=0;
        while(str<end){
            int ht = Math.min(height[str],height[end]);
            int w = end - str;
            int area = ht * w;
            maxarr= Math.max(maxarr,area);
        
            if(height[str]>height[end]){
                end--;
            }
            // else if(height[str]<height[end]){
            //     str++;
            // }
            else{
                str++;
               // end--;
            } 
        } 
        return maxarr;  
    }
}