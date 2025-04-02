class Solution {
    public String solution(String my_string, int[][] queries) {
        char[] arr = my_string.toCharArray();
        
        for(int[] q : queries) {
            int start = q[0];
            int end = q[1];
            
            while(start<end) {
                char tmp = arr[start];
                arr[start] = arr[end];
                arr[end] = tmp;
                
                start++;
                end--;
            }
        }
        
        return new String(arr);
    }
}