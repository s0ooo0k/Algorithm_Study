class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int old = image[sr][sc];
        if (old != newColor) {
            dfs(image, sr, sc, old, newColor);
        }
        return image;
    }

    private void dfs(int[][] image, int r, int c, int old, int newColor) {
        if (r < 0 || r >= image.length || c < 0 || c >= image[0].length) 
            return;
        if (image[r][c] != old) return;

        image[r][c] = newColor;

        dfs(image, r - 1, c, old, newColor); 
        dfs(image, r + 1, c, old, newColor); 
        dfs(image, r, c - 1, old, newColor); 
        dfs(image, r, c + 1, old, newColor); 
    }
}