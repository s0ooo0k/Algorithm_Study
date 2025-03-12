class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        // 그리디

        int len = flowerbed.length;

        for(int i=0; i<len; i++) {
            if(flowerbed[i]==0) {
                boolean left = (i==0 || flowerbed[i-1]==0); // 0이거나 비어있으면 true
                boolean right = (i==len-1 || flowerbed[i+1]==0);

                if(left && right) {
                    flowerbed[i]=1;
                    n--;
                    if(n==0) return true;
                    i++;
                }
            }
        }
            return n<=0;
    }

}