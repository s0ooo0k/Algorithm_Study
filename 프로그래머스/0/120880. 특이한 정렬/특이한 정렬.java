import java.util.*;
class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        
        // 리스트 변환
        List<Integer> list = new ArrayList<>();
        for(int nl : numlist){
            list.add(nl);
        }
        
        // Compare
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer i, Integer j){
                if(Math.abs(n-i)==Math.abs(n-j)) return j-i;
                else return Math.abs(n-i)-Math.abs(n-j);
            }
        });
        
        for(int i=0; i<list.size(); i++){
            answer[i]=list.get(i);
        }
        return answer;
    }
}