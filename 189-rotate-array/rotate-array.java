// class Solution {
//     public void rotate(int[] nums, int k) {
//         int n = nums.length;
//         k = k % n;
//         int[] rot = new int[n];

//         for (int i = 0; i < n; i++) {
//             rotated[(i + k) % n] = nums[i];
//         }

//         for (int i = 0; i < n; i++) {
//             nums[i] = rotated[i];
//         }        
//     }
// }
class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k = k % n;
        int[] temp=new int[n];
       for(int i=0;i<n;i++){
        temp[(i+k)%n]=nums[i];
       }
       for(int i=0;i<n;i++){
        nums[i]=temp[i];
       }
    }
}