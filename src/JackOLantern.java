//Alexander Cox
//Monday, October 26, 2018

public class JackOLantern
{
    String[][] grid;

    public JackOLantern(int width, int height)
    {
        this.grid = new String[width][height];
    }

    public void fill(String str)
    {
        for (int i = 0; i < this.grid.length; i ++)
        {
            for (int j = 0; j < this.grid[i].length; j++)
                this.grid[i][j] = str;
        }
        this.toString();
    }

    public void edit(String replace, int row, int col)
    {
        this.grid[row][col] = replace;
        this.toString();
    }

    public String toString()
    {
        String str = "";
        for (int i = 0; i < this.grid.length; i ++)
        {
            for (int j = 0; j < this.grid[i].length; j++)
                str += this.grid[i][j];
            str += "\n";
        }
        return str;
    }
}