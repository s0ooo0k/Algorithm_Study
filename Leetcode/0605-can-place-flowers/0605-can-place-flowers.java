class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int cnt = 0;
        int len = flowerbed.length;

        if (n==0) return true;
        
        if(len==1) {
            if(flowerbed[0]==0) return n<=1;
            return n==0;
        }

        if(flowerbed[0]==0 && flowerbed[1]==0){
            flowerbed[0]=1;
            cnt++;
            if(cnt==n) return true;
        }

        for(int i=1; i<len-1; i++){
            if(flowerbed[i]==0 && flowerbed[i-1]==0 && flowerbed[i+1]==0){
                flowerbed[i]=1;
                cnt++;
                if(cnt == n) return true;
                i++;
            }
        }
        
        if(flowerbed[len-1]==0 && flowerbed[len-2]==0){
            flowerbed[len-1]=1;
            cnt++;

            if(cnt == n) return true;

        }
        return false;

    }
}