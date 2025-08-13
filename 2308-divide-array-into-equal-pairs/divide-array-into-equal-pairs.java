// class Solution {
//     public boolean divideArray(int[] nums) {
//         Map<Integer, Integer> counter = new HashMap<>();
//         for (int num : nums) {
//             counter.put(num, counter.getOrDefault(num, 0) + 1);
//         }
        
//         for (int count : counter.values()) {
//             if (count % 2 != 0) {
//                 return false;
//             }
//         }
        
//         return true;
//     }
// }
import java.util.Arrays;

class Solution {
    public boolean divideArray(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i += 2) {
            if (nums[i] != nums[i + 1]) {
                return false;
            }
        }
        return true;
    }
}