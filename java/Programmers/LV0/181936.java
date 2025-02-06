// 181936 공배수

class Solution {
    public int solution(int number, int n, int m) {
        int answer = 0;
        if ((number%n==0) && (number%m==0))
            answer=1;
        else 
            answer=0;
        return answer;
    }
}

// 삼항연산자 사용을 습관화하자!
// return number % n == 0 && number % m == 0 ? 1 : 0;