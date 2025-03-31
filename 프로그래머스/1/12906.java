// 12906 같은 숫자는 싫어어

import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
    Stack<Integer> stackInt = new Stack<>();

    int cnt = 0;
        
   for(int i : arr) {
      if(stackInt.isEmpty()){
                 stackInt.push(i);
            }
            else {
                int k = stackInt.pop();
                if(k!=i){
                    stackInt.push(k);
                    stackInt.push(i);
                }
                else {
                    stackInt.push(k);
                }
            }
    }
    // stacklist 변환
    int[] answer = new int[stackInt.size()];
    for (int i = 0; i < stackInt.size(); i++) {
         answer[i] = stackInt.get(i);          
    }
    return answer;
    }
}