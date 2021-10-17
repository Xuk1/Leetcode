class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int pastColor = image[sr][sc];
        dfs(image,sr,sc,pastColor,newColor);
        return image;
    }
    public void dfs(int[][] image, int r, int c, int pastcolor, int newColor){
        if(r<0 || r>=image.length || c<0 || c>=image[0].length || pastcolor == newColor) return;
        if(image[r][c] != pastcolor) return;
        image[r][c] = newColor;
        dfs(image,r-1,c,pastcolor,newColor);
        dfs(image,r+1,c,pastcolor,newColor);
        dfs(image,r,c-1,pastcolor,newColor);
        dfs(image,r,c+1,pastcolor,newColor);
        }
}

/*
执行用时:0 ms
内存消耗:39.2 MB

DFS
*/
