class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        StringBuilder even = new StringBuilder();
        StringBuilder odd = new StringBuilder();
        
        for(int n : num_list) {
            if(n%2==0) 
                even.append(Integer.toString(n));
            else
                odd.append(Integer.toString(n));
        }
        answer = Integer.parseInt(even.toString()) + Integer.parseInt(odd.toString());
        return answer;
    }
}