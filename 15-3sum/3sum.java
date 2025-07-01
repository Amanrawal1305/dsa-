// class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {
//         List<List<Integer>> res = new ArrayList<>();
//         Arrays.sort(nums);

//         for (int i = 0; i < nums.length; i++) {
//             if (i > 0 && nums[i] == nums[i-1]) {
//                 continue;
//             }
            
//             int j = i + 1;
//             int k = nums.length - 1;

//             while (j < k) {
//                 int total = nums[i] + nums[j] + nums[k];

//                 if (total > 0) {
//                     k--;
//                 } else if (total < 0) {
//                     j++;
//                 } else {
//                     res.add(Arrays.asList(nums[i], nums[j], nums[k]));
//                     j++;

//                     while (nums[j] == nums[j-1] && j < k) {
//                         j++;
//                     }
//                 }
//             }
//         }
//         return res;        
//     }
// }
class Solution {
    public List<List<Integer>> threeSum(int[] a) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Arrays.sort(a);
        int n = a.length;
        for(int i =0;i< n-2 && a[i]<=0;++i){
            if(i > 0 && a[i] == a[i-1])continue;
            int twosum = 0-a[i];
            int l = i+1; 
            int r = n-1;
            while(l< r){
                 int sum = a[l] + a[r];
                 if(sum < twosum)++l;
                 else if(sum > twosum)--r;
                 else{
                    ArrayList<Integer> al = new ArrayList<Integer>();
                    al.add(a[i]);
                    al.add(a[l]);
                    al.add(a[r]);
                    res.add(al);
                    ++l;
                    --r;
                    while(l< r && a[l] == a[l-1])++l;
                    while(l< r && a[r] == a[r+1])--r;
                 }
            }
        }
        return res;
    }
}