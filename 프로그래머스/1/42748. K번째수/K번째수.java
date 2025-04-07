import java.util.*;

// class Solution {
//     public int[] solution(int[] array, int[][] commands) {
//         int[] answer = new int[commands.length];
//         List<Integer> num = new ArrayList<>();
        
//         for(int i=0; i<commands.length; i++){
//             for(int j=commands[i][0]-1; j<commands[i][1]; j++){
//                 num.add(array[j]);
//             }
//             Collections.sort(num);
//             answer[i]=num.get(commands[i][2]-1);
//             num.clear();
//         }
        
//         return answer;
//     }
// 

class Solution {
public int[] solution(int[] array, int[][] commands) {
    int[] answer = new int[commands.length];
        
    for(int i=0; i<commands.length; i++) {
        int[] tmp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
        Arrays.sort(tmp);
        answer[i]=tmp[commands[i][2]-1];
    }
        
    return answer;
    }
}