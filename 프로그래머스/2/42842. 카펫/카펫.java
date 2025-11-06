class Solution {
    public int[] solution(int brown, int yellow) {
        int total = brown + yellow;
        
        for (int height = 3; height <= total; height++) {
            if (total % height == 0) {
                int width = total / height;
                
                if (width >= height) {
                    int yellowCount = (width - 2) * (height - 2);
                    
                    if (yellowCount == yellow) {
                        return new int[]{width, height};
                    }
                }
            }
        }
        
        return new int[]{};
    }
}