import java.util.*;

public class Grid
{
    private static final int SIZE = 10;
    int[][] pixels = new int[SIZE][SIZE];
    Stack<Pair> stack = new Stack<>();
    private int num = 1;

    /**
     * Flood fill, starting with the given row and column.
    */
    public void floodfill(int row, int column)
    {
        
        stack.push(new Pair(row, column));
        
        while (!stack.isEmpty()) {
            Pair pair = stack.pop();
            int r = pair.getRow();
            int c = pair.getColumn();
            if (r < 0 || r >= SIZE || c < 0 || c >= SIZE) continue;

            if (pixels[r][c] == 0) {
                pixels[r][c] = num;
                
                num++;
                stack.push(new Pair(r+1, c));
                stack.push(new Pair(r-1, c));
                stack.push(new Pair(r, c+1));
                stack.push(new Pair(r, c-1));
            }
        }
    }

    @Override
    public String toString()
    {
        String r = "";
        for (int i = 0; i < SIZE; i++)
        {
            for (int j = 0; j < SIZE; j++)
                r = r + String.format("%4d", pixels[i][j]);
            r = r + "\n";
        }
        return r;
    }
}
