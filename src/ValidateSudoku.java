import java.util.HashSet;
import java.util.Set;

public class ValidateSudoku {

    /*
    * As a startup that provides a platform for playing Sudoku, we need to ensure that the Sudoku
    * boards created by our users are valid. We want you to implement a function that takes in a
    * Sudoku board as a list of lists and returns a boolean indicating whether the board is valid or not.
    * The board is considered valid if each row, column, and 3x3 sub-box contains the digits 1-9 without repetition.
    * Empty cells can be ignored.
    *
    * Example 1:
    *   board = {
    *   {5, 3, 0, 0, 7, 0, 0, 0, 0},
    *   {6, 0, 0, 1, 9, 5, 0, 0, 0},
    *   {0, 9, 8, 0, 0, 0, 0, 6, 0},
    *   {8, 0, 0, 0, 6, 0, 0, 0, 3},
    *   {4, 0, 0, 8, 0, 3, 0, 0, 1},
    *   {7, 0, 0, 0, 2, 0, 0, 0, 6},
    *   {0, 6, 0, 0, 0, 0, 2, 8, 0},
    *   {0, 0, 0, 4, 1, 9, 0, 0, 5},
    *   {0, 0, 0, 0, 8, 0, 0, 7, 8}}
    *
    *   expectedOutput = true;
    *
    * Example 2:
    *   board = {
    *   {5, 3, 0, 0, 7, 0, 0, 0, 0},
    *   {6, 0, 0, 1, 9, 5, 0, 0, 0},
    *   {0, 9, 8, 0, 0, 0, 0, 6, 0},
    *   {8, 0, 0, 0, 6, 0, 0, 0, 3},
    *   {4, 0, 0, 8, 0, 3, 0, 0, 1},
    *   {7, 0, 0, 0, 2, 0, 0, 0, 6},
    *   {0, 6, 0, 0, 0, 0, 2, 8, 0},
    *   {0, 0, 0, 4, 1, 9, 0, 0, 5},
    *   {0, 0, 0, 0, 8, 0, 0, 7, 8}}
    *
    *   expectedOutput = false;
    *
    * Logic: Traverse the board, use a set to add each column in the row (ignoring 0s). If a number is not added, the
    *   board is not valid.
    *
    * */

    public static boolean isValidSudoku(int[][] board){


        for(int row = 0; row < board.length; row++){
            Set<Integer> set = new HashSet<>();
            for(int column = 0; column < board.length; column++) {
                if(board[row][column] != 0){
                    if(!set.add(board[row][column])){
                        return false;
                    }
                }
            }
        }

        return true;
    }
}
