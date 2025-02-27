// 86501 없는 숫자 더하기

class Solution {
    public int solution(int[] numbers) {
        int answer = -1;
        int cnt = 0;
        for (int n : numbers){
            cnt+=n;
        }
        return 45-cnt;
    }
}