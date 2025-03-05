class Solution {
    public int[] twoSum(int[] nums, int target) {
        int numSize = nums.length;

        for(int i=0; i<numSize; i++){
            for(int j=i+1; j<numSize; j++){
                if((nums[i]+nums[j])==target)
                    return new int[]{i, j};
            }
        }
        return new int[]{0, 0};
    }
}