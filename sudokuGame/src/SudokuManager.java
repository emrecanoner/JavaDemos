public interface SudokuManager {
    int size = 9;
    char[] nameOfValue = {'C', 'N', 'G', 'B', 'I', 'M', '2', '1', '3'};
    char[][] sudoku = new char[9][9];
    char[] dataKeeper = new char[9];
    char[] dataKeeper2 = new char[9];
    char[] dataKeeper3 = new char[9];
    int randNum1 = (int) (Math.random() * 3);
    int randNum2 = (int) (Math.random() * 3);
    int randNum3 = 3 + (int) (Math.random() * 3);
    int randNum4 = 3 + (int) (Math.random() * 3);
    int randNum5 = 6 + (int) (Math.random() * 3);
    int randNum6 = 6 + (int) (Math.random() * 3);
}

