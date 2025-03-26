class Solution {
    public int solution(int[] numbers, int target) {
        int answer = 0;
        
        return dfs(numbers, target, answer, 0);
    }
    
    public int dfs(int[] numbers, int target, int answer, int i){
        if(i==numbers.length) {
             if(target==answer) return 1;
             else return 0;
        }
           
        int left = dfs(numbers, target, answer+numbers[i], i+1);
        int right = dfs(numbers, target, answer-numbers[i], i+1);
        return left+right;
    }
}