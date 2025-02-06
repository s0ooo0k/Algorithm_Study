// 181933 flag에 따라 다른 값 반환하기

class Solution {
    public int solution(int a, int b, boolean flag) {
        return flag ? a+b : a-b;
    }
}