// 120806 두 수의 나눗셈

class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        double n = ((double)num1/num2)*1000;
        answer = (int)n;
        return answer;
    }
}

/* 더 나은 풀이
class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        return num1 * 1000 / num2;
    }
}
*/