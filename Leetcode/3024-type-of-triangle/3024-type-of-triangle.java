class Solution {
    public String triangleType(int[] nums) {
        Arrays.sort(nums);
        int a = nums[0];
        int b = nums[1];
        int c = nums[2];

        
        if(a==b && b==c) return "equilateral";
        if(c>=a+b) return "none";
        if(a==b || b==c || a==c) return "isosceles";
        else return "scalene";
    }
}