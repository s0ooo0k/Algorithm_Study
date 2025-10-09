class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++) {
            sb.setLength(0); 
            int val1 = arr1[i];
            int val2 = arr2[i];
            
            for(int j=0; j<n; j++) {
                if((val1%2==1) || (val2%2==1)) 
                    sb.append('#');
                else sb.append(" ");
                
                val1/=2;
                val2/=2;
            }
            
            answer[i]=sb.reverse().toString();
        }
        return answer;
    }
}