
class Solution {

    public void dfs(int[][] image, int sr, int sc, int Color, int rows, int cols,int source) {
       if(sr<0 || sr>=rows || sc<0 || sc>=cols)//boundry
        return;
        else if(image[sr][sc]!=source)//not iqual to source
         return;
        
        image[sr][sc] = Color;
        
        dfs(image,sr-1,sc,Color,rows,cols,source);   //TOP
        dfs(image,sr+1,sc,Color,rows,cols,source);   //DOWN
        dfs(image,sr,sc-1,Color,rows,cols,source);   //LEFT
        dfs(image,sr,sc+1,Color,rows,cols,source);   //RIGHT
    }
public int[][] floodFill(int[][] image, int sr, int sc, int Color){
        int rows = image.length;
        int cols = image[0].length;
        int source = image[sr][sc]; //store orignal colr
          if (source == Color){//if source is eual to souce 
        return image;
          }
        
        dfs(image,sr,sc,Color,rows,cols,source);
        return image; 
    }
}