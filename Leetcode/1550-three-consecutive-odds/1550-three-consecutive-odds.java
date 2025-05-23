class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i] % 2 == 1) {
                arr[i]=1; 
            }
        }
        
        for(int i=0; i<arr.length-2; i++){
            if(arr[i]==1) {
                if(arr[i+1]==1 && arr[i+2]==1) return true;
            }
        }
        return false;
    }
}