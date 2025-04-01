class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = my_string;
        
        for(int i=0; i<queries.length; i++){
            StringBuilder sb = new StringBuilder();
            for(int j=0; j<queries[i][0]; j++){
                sb.append(answer.charAt(j));
            }
            
            for(int j=queries[i][1]; j>=queries[i][0]; j--){
                sb.append(answer.charAt(j));
            }
            
            for(int j=queries[i][1]+1; j<my_string.length(); j++){
                sb.append(answer.charAt(j));
            }
            answer = sb.toString();
        }
        return answer;
    }
}