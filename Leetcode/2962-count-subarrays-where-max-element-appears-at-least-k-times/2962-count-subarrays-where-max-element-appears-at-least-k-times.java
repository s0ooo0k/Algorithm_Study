class Solution {
    public long countSubarrays(int[] nums, int k) {
        int max = 0;
        int cnt = 0;
        int start =0;
        long answer = 0;
        // 1. 배열에서 max값 찾기
        for(int n : nums) {
            if(n > max) max = n;
        }
        // 2. start, end로 최댓값이 몇 번 나오는지 구하기
        for(int end=0; end<nums.length; end++){
            if(nums[end]==max) cnt++;
            while(cnt >= k) {
                // end에서 찾은 부분 (뒤로 만족하는 개수))
                answer += (nums.length-end);

                if (nums[start] == max) {
                    cnt--;
                }

                start++;
            }
        }
        return answer;
    }
}