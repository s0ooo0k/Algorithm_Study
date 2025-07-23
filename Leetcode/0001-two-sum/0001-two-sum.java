// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int[] answer = new int[2];
//         for(int i=0; i<nums.length; i++) {
//             for(int j=i+1; j<nums.length; j++) {
//                 if(nums[i]+nums[j]==target) {
//                     answer[0]=i;
//                     answer[1]=j;
//                     return answer;
//                 }
//             }
//         }
//         return answer;
//     }
// }

class Solution {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> arr = new HashMap<>();

        for(int i=0; i<nums.length; i++) {
            if(arr.containsKey(target-nums[i])) {
                return new int[]{arr.get(target-nums[i]), i};
            }
            arr.put(nums[i], i);
        }
        return new int[]{0, 0};
    }
    
}