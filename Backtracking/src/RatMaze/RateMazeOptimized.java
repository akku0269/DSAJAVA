package RatMaze;

public class RateMazeOptimized {
    public static void main(String[] args) {
        int rows = 3, cols = 4;
        int[][] maze  = {{1,0,1,1},
                {1,1,1,1},
                {1,1,0,1}};
        boolean[][] isVisited = new boolean[rows][cols];
        print(0, 0, rows-1, cols-1,"",maze);
    }

    private static void print(int stRow, int stCol, int endRow, int endCol , String s,int[][] maze) {

        if(stRow<0 || stCol<0) return;
        if(stRow > endRow || stCol > endCol) return ;
        if(stRow == endRow && stCol == endCol) {
            System.out.println(s);
            return;
        }
        if(maze[stRow][stCol]==0) return; //blocked
        if(maze[stRow][stCol]==-1) return; // visited matlab -1;
        // check
        maze[stRow][stCol] = -1;
        print(stRow+1,stCol,endRow,endCol,s+"D",maze);
        // go right
        print(stRow,stCol+1,endRow,endCol,s+"R",maze);
        // go left
        print(stRow,stCol-1,endRow,endCol,s+"L",maze);
        // go up
        print(stRow-1,stCol,endRow,endCol,s+"U",maze);
        // backtracking
        maze[stRow][stCol] = 1;
    }
}
