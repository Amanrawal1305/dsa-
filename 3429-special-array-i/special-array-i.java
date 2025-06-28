class Solution {
    public boolean isArraySpecial(int[] nums) {
// AMAN RAWAL
//         if(nums.length==1) return true;
//         for(int i=0;i<nums.length;i++){
//          for(int j=i+1;j<nums.length;j++){
//             if(isEven(nums[i])==isEven(nums[i+1])) return false;
//          }
//         }
//         return true;
//     }
//     public boolean isEven(int n){
//         return n%2==0;
//     }
// }
        for (int i = 1; i < nums.length; i++) {
            if (((nums[i] ^ nums[i-1]) & 1) == 0)  
                return false;
        }
        return true;  
    }
}