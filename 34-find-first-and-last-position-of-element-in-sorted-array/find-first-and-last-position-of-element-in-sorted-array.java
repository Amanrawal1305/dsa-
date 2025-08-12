// class Solution {
//     public int[] searchRange(int[] nums, int target) {
//         int [] arr =new int[2];
//         arr[0]=arr[1]=-1;
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]==target){
//                 arr[0]=i;
//                 while(i<nums.length && nums[i+1]==target){
//                     i++;
//                     arr[1]=i;
//                     break;

//                 }
//             }
//         }return arr;
        
//     }
// }
class Solution {

    public static int[] searchTarget(int[] nums , int target)
    {
        int n = nums.length;
        int ans[] = {-1,-1};

        if(n == 0)return ans;
        for(int i = 0;i<n;i++)
        {
            if(target == nums[i])
            {
                if(ans[0] == -1)ans[0] = i;
                else ans[1] = Math.max(ans[1] , i);
            }
        }
        if(ans[1] == -1)ans[1] = ans[0];

        return ans;
    }

    public int[] searchRange(int[] nums, int target) {
        
        return searchTarget(nums,target);
    }
}