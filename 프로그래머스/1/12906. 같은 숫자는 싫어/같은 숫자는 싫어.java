import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> num = new Stack<>();
        
        for(int a : arr){
           if(num.isEmpty()) {
               num.push(a);
           }
            else {
                int n = num.pop();
                if(n==a) {
                    num.push(n);
                }
                else {
                    num.push(n);
                    num.push(a);
                }
            }
        }
        
        int[] answer=new int[num.size()];
        for(int i=0; i<num.size(); i++){
            answer[i]=num.get(i);
        }

        return answer;
    }
}