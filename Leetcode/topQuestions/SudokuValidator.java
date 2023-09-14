package Leetcode.topQuestions;

import java.util.HashSet;
import java.util.Set;

public class SudokuValidator {
    public static void main(String[] args) {
        char[][] sudokuBoard = {
                { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
                { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
                { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
        };

        // Print the Sudoku board
        printSudokuBoard(sudokuBoard);

        boolean isValid = isValidSudoku(sudokuBoard);

        if (isValid) {
            System.out.println("The Sudoku board is valid.");
        } else {
            System.out.println("The Sudoku board is not valid.");
        }
    }

    public static void printSudokuBoard(char[][] board) {
        for (int i = 0; i < 9; i++) {
            if (i % 3 == 0 && i != 0) {
                System.out.println("-----------");
            }
            for (int j = 0; j < 9; j++) {
                if (j % 3 == 0 && j != 0) {
                    System.out.print("| ");
                }
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public  boolean isValidSudoku(char[][] board) {
        Set seen  = new HashSet();
        for(int i = 0; i< 9; i++){
            for(int j = 0; j< 9; j++){
                char number =  board[i][j];
                if(number != '.'){
                    if(!seen.add(number + " in row " + i) ||
                        !seen.add(number + " in column " + j) ||
                        !seen.add(number + " in block " + i/3 + "-" + j/3))

                        return false;
                    
                    
                    
                }
            }
        }
        return true;
    }
}
