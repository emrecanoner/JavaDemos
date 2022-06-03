public class SudokuSolver extends PrintSudoku implements SudokuManager {

    char character;


    public boolean checkRow(int row, char character) { //I send the characters from method solve and if characters don't equal to value in the row of sudoku then return false
        for (int i = 0; i < size; i++) {
            if (sudoku[row][i] == character)
                return true;
        }
        return false;
    }

    public boolean checkColumn(int column, char character) { //I send the characters from method solve and if characters don't equal to value in the column of sudoku then return false
        for (int i = 0; i < size; i++) {
            if (sudoku[i][column] == character)
                return true;
        }
        return false;
    }

    public boolean checkBox(int row, int column, char character) { //I send the characters from method solve and if characters don't equal to value in the 3x3 box of sudoku then return false
        int x = row - row % 3;
        int y = column - column % 3;

        for (int i = x; i < x + 3; i++) {
            for (int j = y; j < y + 3; j++) {
                if (sudoku[i][j] == character) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean finalChecking(int row, int column, char character) { //if the all check methods are false then return true
        return !checkRow(row, character) && !checkColumn(column, character) && !checkBox(row, column, character);
    }

    public boolean solve() {
        for (int row = 0; row < size; row++) {
            for (int column = 0; column < size; column++) {
                if (sudoku[row][column] == '0') {
                    for (int i = 0; i < size; i++) {
                        character = nameOfValue[i];
                        if (finalChecking(row, column, character)) { //if the method of finalChecking is true then send the character to particular row and column of the sudoku
                            sudoku[row][column] = character;

                            if (solve()) { //start recursive method
                                return true;
                            } else { //if there is not a solution then leave empty that row and column
                                sudoku[row][column] = '0';
                            }
                        }
                    }

                    return false;
                }
            }
        }
        return true; //sudoku solved
    }
}
