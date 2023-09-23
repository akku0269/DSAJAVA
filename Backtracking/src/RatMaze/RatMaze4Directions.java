package RatMaze;

public class RatMaze4Directions {
    public static void main(String[] args) {
        int rows = 3, cols = 3;
        boolean[][] isVisited = new boolean[rows][cols];
        print(0, 0, rows-1, cols-1,"",isVisited);
    }

    private static void print(int stRow, int stCol, int endRow, int endCol , String s , boolean[][] isVisited) {

        if(stRow<0 || stCol<0) return;
        if(stRow > endRow || stCol > endCol) return ;
        if(isVisited[stRow][stCol] == true) return;

        if(stRow == endRow && stCol == endCol) {
            System.out.println(s);
            return;
        }
        isVisited[stRow][stCol] = true;
        // go down
        print(stRow+1,stCol,endRow,endCol,s+"D",isVisited);
        // go right
        print(stRow,stCol+1,endRow,endCol,s+"R",isVisited);
        // go left
        print(stRow,stCol-1,endRow,endCol,s+"L",isVisited);
        // go up
        print(stRow-1,stCol,endRow,endCol,s+"U",isVisited);
        // backtracking
        isVisited[stRow][stCol] = false;
    }
}
