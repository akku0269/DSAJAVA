package RatMaze;

public class PrintPathRatMaze {
    public static void main(String[] args) {
        int rows = 3, cols = 3;
        print(0, 0, rows-1, cols-1,"");
    }

    private static void print(int stRow, int stCol, int endRow, int endCol , String s) {

        if(stRow > endRow || stCol > endCol) return ;
        if(stRow == endRow && stCol == endCol) {
            System.out.println(s);
            return;
        }
        // go down
        print(stRow+1,stCol,endRow,endCol,s+"D");
        // go right
        print(stRow,stCol+1,endRow,endCol,s+"R");
    }
}