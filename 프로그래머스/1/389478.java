// 389478 택배 상자 꺼내기

class Solution {
    public int solution(int n, int w, int num) {
        int answer = 0;
        int cnt = 1;
        int boxX = -1, boxY = -1;
        int h = (int) Math.ceil((double) n / w); 
        int[][] boxlist = new int[h][w];

        outerLoop:
        for (int i = 0; i < h; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < w; j++) {
                    boxlist[i][j] = cnt;
                    if (cnt == n) break outerLoop;
                    if (cnt == num) {
                        boxX = i;
                        boxY = j;
                    }
                    cnt++;
                }
            } else {
                for (int j = w - 1; j >= 0; j--) {
                    boxlist[i][j] = cnt;
                    if (cnt == n) break outerLoop;
                    if (cnt == num) {
                        boxX = i;
                        boxY = j;
                    }
                    cnt++;
                }
            }
        }

        for (int i = boxX; i < h; i++) {
            if (boxlist[i][boxY] == 0) break;
            answer++;
        }

        return answer;
    }
}