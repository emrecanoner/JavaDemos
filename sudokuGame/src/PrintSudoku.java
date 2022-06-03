public class PrintSudoku implements SudokuManager {
    void print() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(sudoku[i][j]);
                System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
