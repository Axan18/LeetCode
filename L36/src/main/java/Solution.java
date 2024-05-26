import java.util.*;

public class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer, ArrayList<Character>> rows = new HashMap<>();
        char c;
        for(int i = 0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                c=board[i][j];
                if(c!='.' && rows.containsKey(i) && rows.get(i).contains(c)) return false;
                rows.computeIfAbsent(i,k->new ArrayList<>()).add(c);
            }
        }
        HashMap<Integer, List<Character>> columns = new HashMap<>();
        for(int j = 0;j<9;j++)
        {
            for(int i=0;i<9;i++)
            {
                c=board[i][j];
                if(c!='.' && columns.containsKey(j) && columns.get(j).contains(c)) return false;
                columns.computeIfAbsent(j,k->new ArrayList<>()).add(c);
            }
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(!Box(i,j,board)) return false;
            }
        }
        return true;
    }
    Boolean Box(int i, int j, char[][] board)
    {
        Set<Character> numbers = new HashSet<>();
        int row=i*3;
        int column;
        char c;
        for( ;row<(i+1)*3;row++)
        {
            for( column=j*3;column<(j+1)*3; column++)
            {
                c=board[row][column];
                if(c!='.' && !numbers.add(c)) return false;
            }
        }
        return true;
    }
//    Set<String> seen = new HashSet();
//        for(int i=0;i<9;i++)
//    {
//        for(int j=0;j<9;j++)
//        {
//            char c=board[i][j];
//            if(c!='.')
//            {
//                if(!seen.add(c + "in row "+i) ||
//                        !seen.add(c + " in column " + j) ||
//                        !seen.add(c + " in block " + i/3 + "-" + j/3))
//                    return false;
//            }
//        }
//    }
//        return true;
}
